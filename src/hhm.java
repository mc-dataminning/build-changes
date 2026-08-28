import com.mojang.serialization.MapCodec;

public class hhm implements hhp {
   private final giu a;

   public hhm(giu $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      fjg $$6 = gsm.b.a($$2, gqc::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hht.a {
      public static final MapCodec<hhm.a> a = MapCodec.unit(new hhm.a());

      @Override
      public MapCodec<hhm.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhm($$0.a(git.aj));
      }
   }
}
