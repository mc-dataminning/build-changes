import com.mojang.serialization.MapCodec;

public class hhw implements hhp {
   private final ghx a;

   public hhw(ghx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fjg $$6 = gwx.a($$2, this.a.a(ghx.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hht.a {
      public static final MapCodec<hhw.a> a = MapCodec.unit(new hhw.a());

      @Override
      public MapCodec<hhw.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhw(new ghx($$0.a(git.dz)));
      }
   }
}
