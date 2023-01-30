package tarea5_rodrigovasquez;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea5_RodrigoVasquez {

    public static void main(String[] args) throws ParseException {
        ArrayList inv = new ArrayList();
        ArrayList cesta = new ArrayList();
        Scanner scMain = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------------------------------");
            System.out.println("   < B I E N V E N I D O >");
            System.out.print("""
                               [1] Agregar Producto
                               [2] Modificar Producto
                               [3] Eliminar Producto
                               [4] Simulacion de Facturacion
                               [5] Reporte
                               [6] Salir
                               """);
            System.out.println("------------------------------");
            System.out.print("¿Que accion desea realizar? ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    agregar(inv);
                    break;
                case 2:
                    if (inv == null || inv.size() == 0) {
                        System.out.println("No hay ningun producto en el inventario");
                    } else {
                        modificar(inv);
                    }
                    break;
                case 3:
                    if (inv == null || inv.size() == 0) {
                        System.out.println("No hay ningun producto en el inventario");
                    } else {
                        eliminar(inv);
                    }
                    break;
                case 4:
                    if (inv == null || inv.size() == 0) {
                        System.out.println("No hay ningun producto en el inventario");
                    } else {
                        simulacion(inv, cesta);
                    }
                    break;
                case 5:
                    if (inv == null || inv.size() == 0) {
                        System.out.println("No hay ningun producto en el inventario");
                    } else {
                        reporte(inv);
                    }
                    break;
                case 6:
                    System.out.println("¡Que tenga un buen dia!");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 6);
    }

    public static void agregar(ArrayList inv) throws ParseException {
        Scanner scAdd = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----------------------");
            System.out.print("""
                               [1] Granos Básicos
                               [2] Productos de Limpieza
                               [3] Líquidos
                               [4] Carnes & Embutidos
                               [5] Frutas / Verduras
                               """);
            System.out.println("----------------------");
            System.out.print("¿Que desea agregar? ");
            opcion = scAdd.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nameGrano = scAdd.nextLine();
                    nameGrano = scAdd.nextLine();
                    System.out.print("Ingrese cantidad de quintales: ");
                    int quintales = scAdd.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioGrano = scAdd.nextDouble();
                    int uniTemp;
                    String medida = "";
                    do {
                        System.out.println("-----------");
                        System.out.print("""
                                     [1] Libra
                                     [2] Medida
                                     [3] Kilo
                                     """);
                        System.out.println("-----------");
                        System.out.print("Seleccione la unidad de medida [1 / 2 / 3]: ");
                        uniTemp = scAdd.nextInt();
                        switch (uniTemp) {
                            case 1:
                                medida = "Libra";
                                break;
                            case 2:
                                medida = "Medida";
                                break;
                            case 3:
                                medida = "Kilo";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (uniTemp != 1 && uniTemp != 2 && uniTemp != 3);
                    System.out.print("Ingrese el lugar de procedencia: ");
                    String procedencia = scAdd.nextLine();
                    procedencia = scAdd.nextLine();
                    inv.add(new GranosBasicos(nameGrano, quintales, precioGrano, medida, procedencia));
                    System.out.println("Producto ha sido añadido al inventario");
                    break;
                case 2:
                    int tipoTemp;
                    String tipo = "";
                    do {
                        System.out.println("------------");
                        System.out.print("""
                                       [1] Líquido
                                       [2] Polvo
                                       """);
                        System.out.println("------------");
                        System.out.print("Ingrese el tipo [1 / 2]: ");
                        tipoTemp = scAdd.nextInt();
                        switch (tipoTemp) {
                            case 1:
                                tipo = "Líquido";
                                break;
                            case 2:
                                tipo = "Polvo";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (tipoTemp != 1 && tipoTemp != 2);
                    System.out.print("Ingrese la marca: ");
                    String marcaLmpz = scAdd.nextLine();
                    marcaLmpz = scAdd.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo = scAdd.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precioLmpz = scAdd.nextDouble();
                    System.out.print("Ingrese la cantidad en inventario: ");
                    int invLmpz = scAdd.nextInt();
                    System.out.print("Ingrese el proveedor: ");
                    String proveedor = scAdd.nextLine();
                    proveedor = scAdd.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nameLmpz = scAdd.nextLine();
                    inv.add(new ProductosLimpieza(tipo, marcaLmpz, codigo, proveedor, nameLmpz, precioLmpz, invLmpz));
                    System.out.println("Producto(s) ha sido añadido al inventario");
                    break;
                case 3:
                    int catTemp;
                    String categoria = "";
                    do {
                        System.out.println("--------------");
                        System.out.print("""
                                           [1] Lácteos
                                           [2] Gaseosas
                                           [3] Jugos
                                           [4] Agua 
                                           """);
                        System.out.println("--------------");
                        System.out.print("Ingrese la categoria: ");
                        catTemp = scAdd.nextInt();
                        switch (catTemp) {
                            case 1:
                                categoria = "Lácteos";
                                break;
                            case 2:
                                categoria = "Gaseosas";
                                break;
                            case 3:
                                categoria = "Jugos";
                                break;
                            case 4:
                                categoria = "Agua";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (catTemp != 1 && catTemp != 2 && catTemp != 3 && catTemp != 4);
                    int empaTemp;
                    String empaque = "";
                    do {
                        System.out.println("-------------------");
                        System.out.print("""
                                           [1] Bote / Botella 
                                           [2] Caja
                                           [3] Lata 
                                           """);
                        System.out.println("-------------------");
                        System.out.print("Ingrese el tipo de empaque: ");
                        empaTemp = scAdd.nextInt();
                        switch (empaTemp) {
                            case 1:
                                empaque = "Bote / Botella";
                                break;
                            case 2:
                                empaque = "Caja";
                                break;
                            case 3:
                                empaque = "Lata";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (empaTemp != 1 && empaTemp != 2 && empaTemp != 3);
                    int sizeTemp;
                    String size = "";
                    do {
                        System.out.println("------------");
                        System.out.print("""
                                           [1] Pequeño
                                           [2] Mediano
                                           [3] Grande 
                                           """);
                        System.out.println("------------");
                        System.out.print("Ingrese el tamaño: ");
                        sizeTemp = scAdd.nextInt();
                        switch (sizeTemp) {
                            case 1:
                                size = "Pequeño";
                                break;
                            case 2:
                                size = "Mediano";
                                break;
                            case 3:
                                size = "Grande";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (sizeTemp != 1 && sizeTemp != 2 && sizeTemp != 3);
                    System.out.print("Ingrese el nombre del producto: ");
                    String nameLiquido = scAdd.nextLine();
                    nameLiquido = scAdd.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scAdd.nextDouble();
                    System.out.print("Ingrese la fecha de vencimiento [dd/MM/yyyy]: ");
                    String fechaVen = scAdd.next();
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaVencimiento = format.parse(fechaVen);
                    inv.add(new Liquidos(categoria, empaque, size, nameLiquido, precio, fechaVencimiento));
                    break;
                case 4:
                    System.out.print("Ingrese lugar de procedencia: ");
                    String procedenciaCarne = scAdd.nextLine();
                    procedenciaCarne = scAdd.nextLine();
                    System.out.print("Ingrese la cantidad en inventario: ");
                    int cantInv = scAdd.nextInt();
                    int tipoTempC;
                    String tipoCarne = "";
                    do {
                        System.out.println("-----------------");
                        System.out.print("""
                                           [1] Res
                                           [2] Carne Blanca
                                           [3] Cerdo
                                           """);
                        System.out.println("-----------------");
                        System.out.print("Ingrese el tipo de carne: ");
                        tipoTempC = scAdd.nextInt();
                        switch (tipoTempC) {
                            case 1:
                                tipoCarne = "Res";
                                break;
                            case 2:
                                tipoCarne = "Carne Blanca";
                                break;
                            case 3:
                                tipoCarne = "Cerdo";
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (tipoTempC != 1 && tipoTempC != 2 && tipoTempC != 3);
                    System.out.print("Ingrese el precio: ");
                    double precioCarne = scAdd.nextDouble();
                    inv.add(new CarnesEmbutidos(procedenciaCarne, tipoCarne, cantInv, precioCarne));
                    break;
                case 5:
                    System.out.print("Ingrese el precio: ");
                    double precioFV = scAdd.nextDouble();
                    System.out.print("Ingrese cantidad a inventariar: ");
                    int invFV = scAdd.nextInt();
                    int catTempFV;
                    String categoriaFV = "";
                    do {
                        System.out.println("-------------");
                        System.out.print("""
                                           [1] Fruta
                                           [2] Verdura
                                           """);
                        System.out.println("-------------");
                        System.out.print("Ingrese que tipo de producto es: ");
                        catTempFV = scAdd.nextInt();
                        switch (catTempFV) {
                            case 1:
                                int frutaTemp;
                                do {
                                    System.out.println("-------------------");
                                    System.out.print("""
                                                   [1] Cítricos
                                                   [2] Tropical
                                                   [3] De Grano
                                                   [4] Rica en Fibra
                                                   """);
                                    System.out.println("-------------------");
                                    System.out.print("Ingrese el tipo de fruta: ");
                                    frutaTemp = scAdd.nextInt();
                                    switch (frutaTemp) {
                                        case 1:
                                            categoriaFV = "Cítricos";
                                            break;
                                        case 2:
                                            categoriaFV = "Tropical";
                                            break;
                                        case 3:
                                            categoriaFV = "De Grano";
                                            break;
                                        case 4:
                                            categoriaFV = "Rica en Fibra";
                                            break;
                                        default:
                                            System.out.println("Opcion Invalida");
                                            break;
                                    }
                                } while (frutaTemp != 1 && frutaTemp != 2 && frutaTemp != 3 && frutaTemp != 4);
                                break;
                            case 2:
                                int verduraTemp;
                                do {
                                    System.out.println("----------------");
                                    System.out.print("""
                                                   [1] Tubérculos
                                                   [2] Legumbres
                                                   [3] De Hoja
                                                   """);
                                    System.out.println("----------------");
                                    System.out.print("Ingrese el tipo de verdura: ");
                                    verduraTemp = scAdd.nextInt();
                                    switch (verduraTemp) {
                                        case 1:
                                            categoriaFV = "Tubérculos";
                                            break;
                                        case 2:
                                            categoriaFV = "Legumbres";
                                            break;
                                        case 3:
                                            categoriaFV = "De Hoja";
                                            break;
                                        default:
                                            System.out.println("Opcion Invalida");
                                            break;
                                    }
                                } while (verduraTemp != 1 && verduraTemp != 2 && verduraTemp != 3);
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                break;
                        }
                    } while (catTempFV != 1 && catTempFV != 2);
                    inv.add(new FrutasVerduras(precioFV, invFV, categoriaFV));
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
    }

    public static void modificar(ArrayList inv) throws ParseException {
        Scanner scModi = new Scanner(System.in);
        int opcion;
        int modi;
        do {
            System.out.println("----------------------");
            System.out.print("""
                               [1] Granos Básicos
                               [2] Productos de Limpieza
                               [3] Líquidos
                               [4] Carnes & Embutidos
                               [5] Frutas / Verduras
                               """);
            System.out.println("----------------------");
            System.out.print("¿Que desea modificar? ");
            opcion = scModi.nextInt();
            switch (opcion) {
                case 1:
                    int granos = 0;
                    int i = 1;
                    for (Object object : inv) {
                        if (object instanceof GranosBasicos) {
                            granos++;
                            if (granos == 1) {
                                System.out.println("Granos Básicos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea modificar: ");
                    modi = scModi.nextInt();
                    if (inv.get(modi - 1) instanceof GranosBasicos) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nameGrano = scModi.nextLine();
                        nameGrano = scModi.nextLine();
                        System.out.print("Ingrese cantidad de quintales: ");
                        int quintales = scModi.nextInt();
                        System.out.print("Ingrese el precio del producto: ");
                        double precioGrano = scModi.nextDouble();
                        int uniTemp;
                        String medida = "";
                        do {
                            System.out.println("-----------");
                            System.out.print("""
                                     [1] Libra
                                     [2] Medida
                                     [3] Kilo
                                     """);
                            System.out.println("-----------");
                            System.out.print("Seleccione la unidad de medida [1 / 2 / 3]: ");
                            uniTemp = scModi.nextInt();
                            switch (uniTemp) {
                                case 1:
                                    medida = "Libra";
                                    break;
                                case 2:
                                    medida = "Medida";
                                    break;
                                case 3:
                                    medida = "Kilo";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (uniTemp != 1 && uniTemp != 2 && uniTemp != 3);
                        System.out.print("Ingrese el lugar de procedencia: ");
                        String procedencia = scModi.nextLine();
                        procedencia = scModi.nextLine();
                        ((GranosBasicos) inv.get(modi)).setNombre(nameGrano);
                        ((GranosBasicos) inv.get(modi)).setQuintales(quintales);
                        ((GranosBasicos) inv.get(modi)).setPrecio(precioGrano);
                        ((GranosBasicos) inv.get(modi)).setMedida(medida);
                        ((GranosBasicos) inv.get(modi)).setProcedencia(procedencia);
                        System.out.println("Producto ha sido modificado");
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 2:
                    int limpieza = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof ProductosLimpieza) {
                            limpieza++;
                            if (limpieza == 1) {
                                System.out.println("Productos de Limpieza: ");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea modificar: ");
                    modi = scModi.nextInt();
                    if (inv.get(modi - 1) instanceof ProductosLimpieza) {
                        int tipoTemp;
                        String tipo = "";
                        do {
                            System.out.println("------------");
                            System.out.print("""
                                       [1] Líquido
                                       [2] Polvo
                                       """);
                            System.out.println("------------");
                            System.out.print("Ingrese el tipo [1 / 2]: ");
                            tipoTemp = scModi.nextInt();
                            switch (tipoTemp) {
                                case 1:
                                    tipo = "Líquido";
                                    break;
                                case 2:
                                    tipo = "Polvo";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (tipoTemp != 1 && tipoTemp != 2);
                        System.out.print("Ingrese la marca: ");
                        String marcaLmpz = scModi.nextLine();
                        marcaLmpz = scModi.nextLine();
                        System.out.print("Ingrese el codigo: ");
                        String codigo = scModi.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precioLmpz = scModi.nextDouble();
                        System.out.print("Ingrese la cantidad en inventario: ");
                        int invLmpz = scModi.nextInt();
                        System.out.print("Ingrese el proveedor: ");
                        String proveedor = scModi.nextLine();
                        proveedor = scModi.nextLine();
                        System.out.print("Ingrese el nombre del producto: ");
                        String nameLmpz = scModi.nextLine();
                        ((ProductosLimpieza) inv.get(modi)).setTipo(tipo);
                        ((ProductosLimpieza) inv.get(modi)).setMarca(marcaLmpz);
                        ((ProductosLimpieza) inv.get(modi)).setCodigo(codigo);
                        ((ProductosLimpieza) inv.get(modi)).setPrecio(precioLmpz);
                        ((ProductosLimpieza) inv.get(modi)).setCantidadInv(invLmpz);
                        ((ProductosLimpieza) inv.get(modi)).setProveedor(proveedor);
                        ((ProductosLimpieza) inv.get(modi)).setNombre(nameLmpz);
                        System.out.println("Producto ha sido modificado");
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 3:
                    int liquidos = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof Liquidos) {
                            liquidos++;
                            if (liquidos == 1) {
                                System.out.println("Líquidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea modificar: ");
                    modi = scModi.nextInt();
                    if (inv.get(modi - 1) instanceof Liquidos) {
                        int catTemp;
                        String categoria = "";
                        do {
                            System.out.println("--------------");
                            System.out.print("""
                                           [1] Lácteos
                                           [2] Gaseosas
                                           [3] Jugos
                                           [4] Agua 
                                           """);
                            System.out.println("--------------");
                            System.out.print("Ingrese la categoria: ");
                            catTemp = scModi.nextInt();
                            switch (catTemp) {
                                case 1:
                                    categoria = "Lácteos";
                                    break;
                                case 2:
                                    categoria = "Gaseosas";
                                    break;
                                case 3:
                                    categoria = "Jugos";
                                    break;
                                case 4:
                                    categoria = "Agua";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (catTemp != 1 && catTemp != 2 && catTemp != 3 && catTemp != 4);
                        int empaTemp;
                        String empaque = "";
                        do {
                            System.out.println("-------------------");
                            System.out.print("""
                                           [1] Bote / Botella 
                                           [2] Caja
                                           [3] Lata 
                                           """);
                            System.out.println("-------------------");
                            System.out.print("Ingrese el tipo de empaque: ");
                            empaTemp = scModi.nextInt();
                            switch (empaTemp) {
                                case 1:
                                    empaque = "Bote / Botella";
                                    break;
                                case 2:
                                    empaque = "Caja";
                                    break;
                                case 3:
                                    empaque = "Lata";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (empaTemp != 1 && empaTemp != 2 && empaTemp != 3);
                        int sizeTemp;
                        String size = "";
                        do {
                            System.out.println("------------");
                            System.out.print("""
                                           [1] Pequeño
                                           [2] Mediano
                                           [3] Grande 
                                           """);
                            System.out.println("------------");
                            System.out.print("Ingrese el tamaño: ");
                            sizeTemp = scModi.nextInt();
                            switch (sizeTemp) {
                                case 1:
                                    size = "Pequeño";
                                    break;
                                case 2:
                                    size = "Mediano";
                                    break;
                                case 3:
                                    size = "Grande";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (sizeTemp != 1 && sizeTemp != 2 && sizeTemp != 3);
                        System.out.print("Ingrese el nombre del producto: ");
                        String nameLiquido = scModi.nextLine();
                        nameLiquido = scModi.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = scModi.nextDouble();
                        System.out.print("Ingrese la fecha de vencimiento [dd/MM/yyyy]: ");
                        String fechaVen = scModi.next();
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        Date fechaVencimiento = format.parse(fechaVen);
                        ((Liquidos) inv.get(modi)).setCategoria(categoria);
                        ((Liquidos) inv.get(modi)).setEmpaque(empaque);
                        ((Liquidos) inv.get(modi)).setSize(size);
                        ((Liquidos) inv.get(modi)).setNombre(nameLiquido);
                        ((Liquidos) inv.get(modi)).setPrecio(precio);
                        ((Liquidos) inv.get(modi)).setFechaVencimiento(fechaVencimiento);
                        System.out.println("Producto ha sido modificado");
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 4:
                    int carnes = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof CarnesEmbutidos) {
                            carnes++;
                            if (carnes == 1) {
                                System.out.println("Carnes & Embutidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea modificar: ");
                    modi = scModi.nextInt();
                    if (inv.get(modi - 1) instanceof CarnesEmbutidos) {
                        System.out.print("Ingrese lugar de procedencia: ");
                        String procedenciaCarne = scModi.nextLine();
                        procedenciaCarne = scModi.nextLine();
                        System.out.print("Ingrese la cantidad en inventario: ");
                        int cantInv = scModi.nextInt();
                        int tipoTempC;
                        String tipoCarne = "";
                        do {
                            System.out.println("-----------------");
                            System.out.print("""
                                           [1] Res
                                           [2] Carne Blanca
                                           [3] Cerdo
                                           """);
                            System.out.println("-----------------");
                            System.out.print("Ingrese el tipo de carne: ");
                            tipoTempC = scModi.nextInt();
                            switch (tipoTempC) {
                                case 1:
                                    tipoCarne = "Res";
                                    break;
                                case 2:
                                    tipoCarne = "Carne Blanca";
                                    break;
                                case 3:
                                    tipoCarne = "Cerdo";
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (tipoTempC != 1 && tipoTempC != 2 && tipoTempC != 3);
                        System.out.print("Ingrese el precio: ");
                        double precioCarne = scModi.nextDouble();
                        ((CarnesEmbutidos) inv.get(modi)).setProcedencia(procedenciaCarne);
                        ((CarnesEmbutidos) inv.get(modi)).setCantidadInv(cantInv);
                        ((CarnesEmbutidos) inv.get(modi)).setTipo(tipoCarne);
                        ((CarnesEmbutidos) inv.get(modi)).setPrecio(precioCarne);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 5:
                    int frutas = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof FrutasVerduras) {
                            frutas++;
                            if (frutas == 1) {
                                System.out.println("Frutas / Verduras:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea modificar: ");
                    modi = scModi.nextInt();
                    if (inv.get(modi - 1) instanceof FrutasVerduras) {
                        System.out.print("Ingrese el precio: ");
                        double precioFV = scModi.nextDouble();
                        System.out.print("Ingrese cantidad a inventariar: ");
                        int invFV = scModi.nextInt();
                        int catTempFV;
                        String categoriaFV = "";
                        do {
                            System.out.println("-------------");
                            System.out.print("""
                                           [1] Fruta
                                           [2] Verdura
                                           """);
                            System.out.println("-------------");
                            System.out.print("Ingrese que tipo de producto es: ");
                            catTempFV = scModi.nextInt();
                            switch (catTempFV) {
                                case 1:
                                    int frutaTemp;
                                    do {
                                        System.out.println("-------------------");
                                        System.out.print("""
                                                   [1] Cítricos
                                                   [2] Tropical
                                                   [3] De Grano
                                                   [4] Rica en Fibra
                                                   """);
                                        System.out.println("-------------------");
                                        System.out.print("Ingrese el tipo de fruta: ");
                                        frutaTemp = scModi.nextInt();
                                        switch (frutaTemp) {
                                            case 1:
                                                categoriaFV = "Cítricos";
                                                break;
                                            case 2:
                                                categoriaFV = "Tropical";
                                                break;
                                            case 3:
                                                categoriaFV = "De Grano";
                                                break;
                                            case 4:
                                                categoriaFV = "Rica en Fibra";
                                                break;
                                            default:
                                                System.out.println("Opcion Invalida");
                                                break;
                                        }
                                    } while (frutaTemp != 1 && frutaTemp != 2 && frutaTemp != 3 && frutaTemp != 4);
                                    break;
                                case 2:
                                    int verduraTemp;
                                    do {
                                        System.out.println("----------------");
                                        System.out.print("""
                                                   [1] Tubérculos
                                                   [2] Legumbres
                                                   [3] De Hoja
                                                   """);
                                        System.out.println("----------------");
                                        System.out.print("Ingrese el tipo de verdura: ");
                                        verduraTemp = scModi.nextInt();
                                        switch (verduraTemp) {
                                            case 1:
                                                categoriaFV = "Tubérculos";
                                                break;
                                            case 2:
                                                categoriaFV = "Legumbres";
                                                break;
                                            case 3:
                                                categoriaFV = "De Hoja";
                                                break;
                                            default:
                                                System.out.println("Opcion Invalida");
                                                break;
                                        }
                                    } while (verduraTemp != 1 && verduraTemp != 2 && verduraTemp != 3);
                                    break;
                                default:
                                    System.out.println("Opcion Invalida");
                                    break;
                            }
                        } while (catTempFV != 1 && catTempFV != 2);
                        ((FrutasVerduras) inv.get(modi)).setPrecio(precioFV);
                        ((FrutasVerduras) inv.get(modi)).setCantInv(invFV);
                        ((FrutasVerduras) inv.get(modi)).setCategoria(categoriaFV);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
    }

    public static void eliminar(ArrayList inv) {
        Scanner scElim = new Scanner(System.in);
        int opcion;
        int elim;
        do {
            System.out.println("----------------------");
            System.out.print("""
                               [1] Granos Básicos
                               [2] Productos de Limpieza
                               [3] Líquidos
                               [4] Carnes & Embutidos
                               [5] Frutas / Verduras
                               """);
            System.out.println("----------------------");
            System.out.print("¿Que categoria desea eliminar? ");
            opcion = scElim.nextInt();
            switch (opcion) {
                case 1:
                    int granos = 0;
                    int i = 1;
                    for (Object object : inv) {
                        if (object instanceof GranosBasicos) {
                            granos++;
                            if (granos == 1) {
                                System.out.println("Granos Básicos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea eliminar: ");
                    elim = scElim.nextInt();
                    if (inv.get(elim - 1) instanceof GranosBasicos) {
                        inv.remove(elim - 1);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 2:
                    int limpieza = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof ProductosLimpieza) {
                            limpieza++;
                            if (limpieza == 1) {
                                System.out.println("Productos de Limpieza: ");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea eliminar: ");
                    elim = scElim.nextInt();
                    if (inv.get(elim - 1) instanceof ProductosLimpieza) {
                        inv.remove(elim - 1);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 3:
                    int liquidos = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof Liquidos) {
                            liquidos++;
                            if (liquidos == 1) {
                                System.out.println("Líquidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea eliminar: ");
                    elim = scElim.nextInt();
                    if (inv.get(elim - 1) instanceof Liquidos) {
                        inv.remove(elim - 1);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 4:
                    int carnes = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof CarnesEmbutidos) {
                            carnes++;
                            if (carnes == 1) {
                                System.out.println("Carnes & Embutidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea eliminar: ");
                    elim = scElim.nextInt();
                    if (inv.get(elim - 1) instanceof CarnesEmbutidos) {
                        inv.remove(elim - 1);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 5:
                    int frutas = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof FrutasVerduras) {
                            frutas++;
                            if (frutas == 1) {
                                System.out.println("Frutas / Verduras:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea eliminar: ");
                    elim = scElim.nextInt();
                    if (inv.get(elim - 1) instanceof FrutasVerduras) {
                        inv.remove(elim - 1);
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
    }

    public static void simulacion(ArrayList inv, ArrayList cesta) {
        Scanner scSim = new Scanner(System.in);
        int opcion;
        double totPag;
        int acum = 0;
        int compra;
        double ISV;
        do {
            System.out.println("-------------------------");
            System.out.print("""
                               [1] Granos Básicos
                               [2] Productos de Limpieza
                               [3] Líquidos
                               [4] Carnes & Embutidos
                               [5] Frutas / Verduras
                               [6] Salir
                               """);
            System.out.println("-------------------------");
            System.out.print("¿Que desea comprar? ");
            opcion = scSim.nextInt();
            switch (opcion) {
                case 1:
                    int granos = 0;
                    int i = 1;
                    for (Object object : inv) {
                        if (object instanceof GranosBasicos) {
                            granos++;
                            if (granos == 1) {
                                System.out.println("Granos Básicos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea comprar: ");
                    compra = scSim.nextInt();
                    if (inv.get(compra - 1) instanceof GranosBasicos) {
                        System.out.print("¿Cuantas " + ((GranosBasicos) inv.get(compra - 1)).getMedida() + " desea comprar? ");
                        int cant = scSim.nextInt();
                        acum += (cant * ((GranosBasicos) inv.get(compra - 1)).getPrecio());
                        System.out.println("Su compra fue procesada");
                        cesta.add(inv.get(compra - 1));
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 2:
                    int limpieza = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof ProductosLimpieza) {
                            limpieza++;
                            if (limpieza == 1) {
                                System.out.println("Productos de Limpieza: ");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea comprar: ");
                    compra = scSim.nextInt();
                    if (inv.get(compra - 1) instanceof ProductosLimpieza) {
                        System.out.print("¿Cuantos " + ((ProductosLimpieza) inv.get(compra - 1)).getMarca() + " desea comprar? ");
                        int cant = scSim.nextInt();
                        if (cant > ((ProductosLimpieza) inv.get(compra - 1)).getCantidadInv()) {
                            System.out.println("No tenemos esa cantidad en inventario");
                        } else {
                            acum += (cant * ((ProductosLimpieza) inv.get(compra - 1)).getPrecio());
                            System.out.println("Su compra se ha procesado");
                            cesta.add(inv.get(compra - 1));
                            ((ProductosLimpieza) inv.get(compra - 1)).setCantidadInv(((ProductosLimpieza) inv.get(compra - 1)).getCantidadInv() - cant);
                        }
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 3:
                    int liquidos = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof Liquidos) {
                            liquidos++;
                            if (liquidos == 1) {
                                System.out.println("Líquidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea comprar: ");
                    compra = scSim.nextInt();
                    if (inv.get(compra - 1) instanceof Liquidos) {
                        System.out.print("Ingrese la cantidad de " + ((Liquidos) inv.get(compra - 1)).getNombre() + " que desea comprar: ");
                        int cant = scSim.nextInt();
                        acum += (cant * ((Liquidos) inv.get(compra - 1)).getPrecio());
                        System.out.println("Su compra se ha procesado");
                        cesta.add(inv.get(compra - 1));
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 4:
                    int carnes = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof CarnesEmbutidos) {
                            carnes++;
                            if (carnes == 1) {
                                System.out.println("Carnes & Embutidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea comprar: ");
                    compra = scSim.nextInt();
                    if (inv.get(compra - 1) instanceof CarnesEmbutidos) {
                        System.out.print("Ingrese la cantidad de " + ((CarnesEmbutidos) inv.get(compra - 1)).getTipo() + " que desea comprar: ");
                        int cant = scSim.nextInt();
                        if (cant > ((CarnesEmbutidos) inv.get(compra - 1)).getCantidadInv()) {
                            System.out.println("No tenemos esa cantidad en inventario");
                        } else {
                            acum += (cant * ((CarnesEmbutidos) inv.get(compra - 1)).getPrecio());
                            System.out.println("Su compra se ha procesado");
                            cesta.add(inv.get(compra - 1));
                            ((CarnesEmbutidos) inv.get(compra - 1)).setCantidadInv(((CarnesEmbutidos) inv.get(compra - 1)).getCantidadInv() - cant);
                        }
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 5:
                    int frutas = 0;
                    i = 1;
                    for (Object object : inv) {
                        if (object instanceof FrutasVerduras) {
                            frutas++;
                            if (frutas == 1) {
                                System.out.println("Frutas / Verduras:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    System.out.print("Ingrese el producto que desea comprar: ");
                    compra = scSim.nextInt();
                    if (inv.get(compra - 1) instanceof FrutasVerduras) {
                        System.out.print("Ingrese cuantas frutas/verduras desea: ");
                        int cant = scSim.nextInt();
                        if (cant > ((FrutasVerduras) inv.get(compra - 1)).getCantInv()) {
                            System.out.println("No tenemos esa cantidad en inventario");
                        } else {
                            acum += (cant * ((FrutasVerduras) inv.get(compra - 1)).getPrecio());
                            System.out.println("Su compra se ha procesado");
                            cesta.add(inv.get(compra - 1));
                            ((FrutasVerduras) inv.get(compra - 1)).setCantInv(((FrutasVerduras) inv.get(compra - 1)).getCantInv() - cant);
                        }
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                    break;
                case 6:
                    System.out.println("[PRODUCTOS COMPRADOS]");
                    granos = 0;
                    i = 1;
                    for (Object object : cesta) {
                        if (object instanceof GranosBasicos) {
                            granos++;
                            if (granos == 1) {
                                System.out.println("Granos Básicos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    limpieza = 0;
                    i = 1;
                    for (Object object : cesta) {
                        if (object instanceof ProductosLimpieza) {
                            limpieza++;
                            if (limpieza == 1) {
                                System.out.println("Productos de Limpieza: ");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    liquidos = 0;
                    i = 1;
                    for (Object object : cesta) {
                        if (object instanceof Liquidos) {
                            liquidos++;
                            if (liquidos == 1) {
                                System.out.println("Líquidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    carnes = 0;
                    i = 1;
                    for (Object object : cesta) {
                        if (object instanceof CarnesEmbutidos) {
                            carnes++;
                            if (carnes == 1) {
                                System.out.println("Carnes & Embutidos:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    frutas = 0;
                    i = 1;
                    for (Object object : cesta) {
                        if (object instanceof FrutasVerduras) {
                            frutas++;
                            if (frutas == 1) {
                                System.out.println("Frutas / Verduras:");
                            }
                            System.out.println("#" + i + "\n" + object);
                        }
                        i++;
                    }
                    ISV = (acum * 0.15);
                    System.out.println("Impuesto sobre venta: " + ISV);
                    totPag = acum + ISV;
                    System.out.println("Total a pagar: " + totPag);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 6 && opcion > 0 && opcion < 6);
    }

    public static void reporte(ArrayList inv) {
        int i = 0;
        for (Object object : inv) {
            if (object instanceof GranosBasicos) {
                i++;
                if (i == 1) {
                    System.out.println("Granos Básicos:");
                }
                System.out.println("#" + i + "\n" + object);
            }
        }
        i = 0;
        for (Object object : inv) {
            if (object instanceof ProductosLimpieza) {
                i++;
                if (i == 1) {
                    System.out.println("Productos de Limpieza: ");
                }
                System.out.println("#" + i + "\n" + object);
            }
        }
        i = 0;
        for (Object object : inv) {
            if (object instanceof Liquidos) {
                i++;
                if (i == 1) {
                    System.out.println("Líquidos:");
                }
                System.out.println("#" + i + "\n" + object);
            }
        }
        i = 0;
        for (Object object : inv) {
            if (object instanceof CarnesEmbutidos) {
                i++;
                if (i == 1) {
                    System.out.println("Carnes & Embutidos:");
                }
                System.out.println("#" + i + "\n" + object);
            }
        }
        i = 0;
        for (Object object : inv) {
            if (object instanceof FrutasVerduras) {
                i++;
                if (i == 1) {
                    System.out.println("Frutas / Verduras:");
                }
                System.out.println("#" + i + "\n" + object);
            }
        }
    }

}
