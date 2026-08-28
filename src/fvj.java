import java.util.function.Consumer;

public class fvj implements fvg {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public fvj(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fvj(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static fvj a(int $$0) {
      return new fvj($$0, 0);
   }

   public static fvj b(int $$0) {
      return new fvj(0, $$0);
   }

   @Override
   public void j(int $$0) {
      this.a = $$0;
   }

   @Override
   public void k(int $$0) {
      this.b = $$0;
   }

   @Override
   public int F() {
      return this.a;
   }

   @Override
   public int G() {
      return this.b;
   }

   @Override
   public int A() {
      return this.c;
   }

   @Override
   public int y() {
      return this.d;
   }

   @Override
   public void a(Consumer<fro> $$0) {
   }
}
