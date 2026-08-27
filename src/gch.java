public class gch extends geh<cgw, fnn<cgw>> {
   private static final ajh a = new ajh("textures/entity/breeze/breeze.png");

   public gch(gdb.a $$0) {
      super($$0, new fnn<>($$0.a(fre.s)), 0.5F);
      this.a(new ggl(this));
      this.a(new ggk(this));
   }

   public void a(cgw $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      fnn<cgw> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cgw $$0) {
      return a;
   }

   public static fnn<cgw> a(fnn<cgw> $$0, frf... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (frf $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
