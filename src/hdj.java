import com.mojang.serialization.MapCodec;

public class hdj implements hdm {
   private final gfa a;

   public hdj(gfa $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      ffw $$6 = goo.a.a($$2, gmf::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdq.a {
      public static final MapCodec<hdj.a> a = MapCodec.unit(new hdj.a());

      @Override
      public MapCodec<hdj.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdj($$0.a(gez.ad));
      }
   }
}
