import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vv(vv.a b) implements vx {
   public static final aex a = new aex("debug/brain");

   public vv(sp $$0) {
      this(new vv.a($$0));
   }

   @Override
   public void a(sp $$0) {
      this.b.a($$0);
   }

   @Override
   public aex a() {
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
      ehn h,
      String i,
      @Nullable ebb j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<gw> q,
      Set<gw> r
   ) {
      public a(sp $$0) {
         this(
            $$0.o(),
            $$0.readInt(),
            $$0.r(),
            $$0.r(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.r(),
            $$0.c(ebb::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(sp::r),
            $$0.a(sp::r),
            $$0.a(sp::r),
            $$0.a(sp::r),
            $$0.a(HashSet::new, sp::e),
            $$0.a(HashSet::new, sp::e)
         );
      }

      public void a(sp $$0) {
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
         $$0.a(this.m, sp::a);
         $$0.a(this.n, sp::a);
         $$0.a(this.o, sp::a);
         $$0.a(this.p, sp::a);
         $$0.a(this.q, sp::a);
         $$0.a(this.r, sp::a);
      }

      public boolean a(gw $$0) {
         return this.q.contains($$0);
      }

      public boolean b(gw $$0) {
         return this.r.contains($$0);
      }
   }
}
