import com.mojang.serialization.MapCodec;

public class hdz implements hds {
   private final geh a;

   public hdz(geh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      ffy $$6 = gtc.a($$2, this.a.a(geh.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdw.a {
      public static final MapCodec<hdz.a> a = MapCodec.unit(new hdz.a());

      @Override
      public MapCodec<hdz.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdz(new geh($$0.a(gfc.dl)));
      }
   }
}
