import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zx(zx.a c) implements aaa {
   public static final yq<vs, zx> a = aaa.a(zx::a, zx::new);
   public static final aaa.b<zx> b = aaa.a("debug/brain");

   private zx(vs $$0) {
      this(new zx.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aaa.b<zx> a() {
      return b;
   }

   public zx.a b() {
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
      etf h,
      String i,
      @Nullable emf j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<im> q,
      Set<im> r
   ) {
      public a(vs $$0) {
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
            $$0.c(emf::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(HashSet::new, im.b),
            $$0.a(HashSet::new, im.b)
         );
      }

      public void a(vs $$0) {
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
         $$0.a(this.m, vs::a);
         $$0.a(this.n, vs::a);
         $$0.a(this.o, vs::a);
         $$0.a(this.p, vs::a);
         $$0.a(this.q, im.b);
         $$0.a(this.r, im.b);
      }

      public boolean a(im $$0) {
         return this.q.contains($$0);
      }

      public boolean b(im $$0) {
         return this.r.contains($$0);
      }
   }
}
