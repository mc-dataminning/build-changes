import com.mojang.serialization.MapCodec;

public class hdq implements hdt {
   private final gfe a;

   public hdq(gfe $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      ffz $$6 = gos.a.a($$2, gmj::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdx.a {
      public static final MapCodec<hdq.a> a = MapCodec.unit(new hdq.a());

      @Override
      public MapCodec<hdq.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdq($$0.a(gfd.ad));
      }
   }
}
