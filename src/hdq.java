import com.mojang.serialization.MapCodec;

public class hdq implements hdk {
   private final geg a;

   public hdq(geg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwn $$0, ffu $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      ffy $$6 = gta.a($$2, this.a.a(geg.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdo.a {
      public static final MapCodec<hdq.a> a = MapCodec.unit(new hdq.a());

      @Override
      public MapCodec<hdq.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdq(new geg($$0.a(gfb.dl)));
      }
   }
}
