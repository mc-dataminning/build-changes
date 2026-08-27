import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record ws(ws.a b) implements wu {
   public static final afw a = new afw("debug/brain");

   public ws(tl $$0) {
      this(new ws.a($$0));
   }

   @Override
   public void a(tl $$0) {
      this.b.a($$0);
   }

   @Override
   public afw a() {
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
      eif h,
      String i,
      @Nullable ebt j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ht> q,
      Set<ht> r
   ) {
      public a(tl $$0) {
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
            $$0.c(ebt::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(tl::s),
            $$0.a(tl::s),
            $$0.a(tl::s),
            $$0.a(tl::s),
            $$0.a(HashSet::new, tl::e),
            $$0.a(HashSet::new, tl::e)
         );
      }

      public void a(tl $$0) {
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
         $$0.a(this.m, tl::a);
         $$0.a(this.n, tl::a);
         $$0.a(this.o, tl::a);
         $$0.a(this.p, tl::a);
         $$0.a(this.q, tl::a);
         $$0.a(this.r, tl::a);
      }

      public boolean a(ht $$0) {
         return this.q.contains($$0);
      }

      public boolean b(ht $$0) {
         return this.r.contains($$0);
      }
   }
}
