import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record yx(yx.a c) implements za {
   public static final xq<us, yx> a = za.a(yx::a, yx::new);
   public static final za.b<yx> b = za.a("debug/brain");

   private yx(us $$0) {
      this(new yx.a($$0));
   }

   private void a(us $$0) {
      this.c.a($$0);
   }

   @Override
   public za.b<yx> a() {
      return b;
   }

   public yx.a b() {
      return this.c;
   }

   public static record a(
      UUID a,
      int b,
      String c,
      String d,
      int e,
      float f,
      float g,
      eov h,
      String i,
      @Nullable eig j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ib> q,
      Set<ib> r
   ) {
      public a(us $$0) {
         this(
            $$0.n(),
            $$0.readInt(),
            $$0.p(),
            $$0.p(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.p(),
            $$0.c(eig::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(us::p),
            $$0.a(us::p),
            $$0.a(us::p),
            $$0.a(us::p),
            $$0.a(HashSet::new, ib.b),
            $$0.a(HashSet::new, ib.b)
         );
      }

      public void a(us $$0) {
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
         $$0.a(this.m, us::a);
         $$0.a(this.n, us::a);
         $$0.a(this.o, us::a);
         $$0.a(this.p, us::a);
         $$0.a(this.q, ib.b);
         $$0.a(this.r, ib.b);
      }

      public boolean a(ib $$0) {
         return this.q.contains($$0);
      }

      public boolean b(ib $$0) {
         return this.r.contains($$0);
      }
   }
}
