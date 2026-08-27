import com.mojang.serialization.MapCodec;

public class ww implements wt {
   public static final wu<ww> a = new wu<ww>() {
      private static final MapCodec<ww> a = wa.b.a.xmap(ww::new, $$0 -> $$0.e);

      @Override
      public MapCodec<ww> a() {
         return a;
      }

      public void a(ug $$0, ww $$1) {
         $$0.a(sz.a, wa.b.b, $$1.e);
      }

      public ww a(ug $$0) {
         wa $$1 = $$0.a(sz.a, wa.b.b);
         return new ww($$1);
      }
   };
   public static final ww b = new ww(wa.a);
   public static final ww c = new ww(wa.a.a(n.m));
   public static final ww d = new ww(wa.a.a(n.o));
   final wa e;

   public ww(wa $$0) {
      this.e = $$0;
   }

   @Override
   public vr a(int $$0) {
      return vd.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public wu<ww> a() {
      return a;
   }
}
