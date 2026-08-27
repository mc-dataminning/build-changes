import com.mojang.serialization.MapCodec;

public class wz implements ww {
   public static final wx<wz> a = new wx<wz>() {
      private static final MapCodec<wz> a = wd.b.a.xmap(wz::new, $$0 -> $$0.e);

      @Override
      public MapCodec<wz> a() {
         return a;
      }

      public void a(uj $$0, wz $$1) {
         $$0.a(tc.a, wd.b.b, $$1.e);
      }

      public wz a(uj $$0) {
         wd $$1 = $$0.a(tc.a, wd.b.b);
         return new wz($$1);
      }
   };
   public static final wz b = new wz(wd.a);
   public static final wz c = new wz(wd.a.a(n.m));
   public static final wz d = new wz(wd.a.a(n.o));
   final wd e;

   public wz(wd $$0) {
      this.e = $$0;
   }

   @Override
   public vu a(int $$0) {
      return vg.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public wx<wz> a() {
      return a;
   }
}
