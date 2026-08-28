import com.mojang.serialization.MapCodec;

public class hdp implements hds {
   private final gfd a;

   public hdp(gfd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      ffy $$6 = gor.a.a($$2, gmi::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdw.a {
      public static final MapCodec<hdp.a> a = MapCodec.unit(new hdp.a());

      @Override
      public MapCodec<hdp.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdp($$0.a(gfc.ad));
      }
   }
}
