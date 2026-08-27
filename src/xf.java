import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xf(xf.a b) implements xh {
   public static final agm a = new agm("debug/brain");

   public xf(ty $$0) {
      this(new xf.a($$0));
   }

   @Override
   public void a(ty $$0) {
      this.b.a($$0);
   }

   @Override
   public agm a() {
      return a;
   }

   public static record a(
      UUID a,
      int b,
      String c,
      String d,
      int e,
      float f,
      float g,
      ejz h,
      String i,
      @Nullable edm j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<hx> q,
      Set<hx> r
   ) {
      public a(ty $$0) {
         this(
            $$0.p(),
            $$0.readInt(),
            $$0.s(),
            $$0.s(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.s(),
            $$0.c(edm::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(ty::s),
            $$0.a(ty::s),
            $$0.a(ty::s),
            $$0.a(ty::s),
            $$0.a(HashSet::new, ty::e),
            $$0.a(HashSet::new, ty::e)
         );
      }

      public void a(ty $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.p(this.e);
         $$0.a(this.f);
         $$0.a(this.g);
         $$0.a(this.h);
         $$0.a(this.i);
         $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.k);
         $$0.p(this.l);
         $$0.a(this.m, ty::a);
         $$0.a(this.n, ty::a);
         $$0.a(this.o, ty::a);
         $$0.a(this.p, ty::a);
         $$0.a(this.q, ty::a);
         $$0.a(this.r, ty::a);
      }

      public boolean a(hx $$0) {
         return this.q.contains($$0);
      }

      public boolean b(hx $$0) {
         return this.r.contains($$0);
      }
   }
}
