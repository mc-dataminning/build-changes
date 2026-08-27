import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zl(zl.a c) implements zo {
   public static final ye<vg, zl> a = zo.a(zl::a, zl::new);
   public static final zo.b<zl> b = zo.a("debug/brain");

   private zl(vg $$0) {
      this(new zl.a($$0));
   }

   private void a(vg $$0) {
      this.c.a($$0);
   }

   @Override
   public zo.b<zl> a() {
      return b;
   }

   public zl.a b() {
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
      esa h,
      String i,
      @Nullable elg j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ib> q,
      Set<ib> r
   ) {
      public a(vg $$0) {
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
            $$0.c(elg::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vg::p),
            $$0.a(vg::p),
            $$0.a(vg::p),
            $$0.a(vg::p),
            $$0.a(HashSet::new, ib.b),
            $$0.a(HashSet::new, ib.b)
         );
      }

      public void a(vg $$0) {
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
         $$0.a(this.m, vg::a);
         $$0.a(this.n, vg::a);
         $$0.a(this.o, vg::a);
         $$0.a(this.p, vg::a);
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
