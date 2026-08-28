import com.mojang.serialization.MapCodec;

public class hey implements her {
   private final gfg a;

   public hey(gfg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fgv $$6 = gub.a($$2, this.a.a(gfg.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hev.a {
      public static final MapCodec<hey.a> a = MapCodec.unit(new hey.a());

      @Override
      public MapCodec<hey.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new hey(new gfg($$0.a(ggb.dn)));
      }
   }
}
