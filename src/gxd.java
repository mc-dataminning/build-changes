import javax.annotation.Nullable;

public class gxd<S extends gza, M extends gca<S>> extends gws<S, M> {
   private final gbw a;
   private final gbw b;
   private final gwc c;

   public gxd(gua<S, M> $$0, gey $$1, gwc $$2) {
      super($$0);
      this.a = new gbw($$1.a(gfb.aF));
      this.b = new gbw($$1.a(gfb.aG));
      this.c = $$2;
   }

   public void a(fft $$0, glx $$1, int $$2, S $$3, float $$4, float $$5) {
      cwo $$6 = $$3.W;
      det $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         akv $$8 = a($$3);
         gbw $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hgx.d.c, $$7.c().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static akv a(gza $$0) {
      if ($$0 instanceof gzv $$1) {
         hft $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.ay) {
            return $$2.c();
         }
      }

      return null;
   }
}
