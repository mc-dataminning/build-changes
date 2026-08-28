import javax.annotation.Nullable;

public class gyd<S extends haa, M extends gda<S>> extends gxs<S, M> {
   private final gcw a;
   private final gcw b;
   private final gxc c;

   public gyd(gva<S, M> $$0, gfy $$1, gxc $$2) {
      super($$0);
      this.a = new gcw($$1.a(ggb.aH));
      this.b = new gcw($$1.a(ggb.aI));
      this.c = $$2;
   }

   public void a(fgr $$0, gmx $$1, int $$2, S $$3, float $$4, float $$5) {
      cxh $$6 = $$3.W;
      dfm $$7 = $$6.a(kv.E);
      if ($$7 != null && !$$7.c().isEmpty()) {
         aku $$8 = a($$3);
         gcw $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hhx.d.c, $$7.c().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static aku a(haa $$0) {
      if ($$0 instanceof hav $$1) {
         hgt $$2 = $$1.a;
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
