import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xy(xy.a b) implements yb {
   public static final ahh a = new ahh("debug/brain");

   public xy(uj $$0) {
      this(new xy.a($$0));
   }

   @Override
   public void a(uj $$0) {
      this.b.a($$0);
   }

   @Override
   public ahh a() {
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
      emc h,
      String i,
      @Nullable efo j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<hx> q,
      Set<hx> r
   ) {
      public a(uj $$0) {
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
            $$0.c(efo::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(uj::s),
            $$0.a(uj::s),
            $$0.a(uj::s),
            $$0.a(uj::s),
            $$0.a(HashSet::new, uj::e),
            $$0.a(HashSet::new, uj::e)
         );
      }

      public void a(uj $$0) {
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
         $$0.a(this.m, uj::a);
         $$0.a(this.n, uj::a);
         $$0.a(this.o, uj::a);
         $$0.a(this.p, uj::a);
         $$0.a(this.q, uj::a);
         $$0.a(this.r, uj::a);
      }

      public boolean a(hx $$0) {
         return this.q.contains($$0);
      }

      public boolean b(hx $$0) {
         return this.r.contains($$0);
      }
   }
}
