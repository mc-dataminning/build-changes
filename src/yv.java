import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record yv(yv.a c) implements yy {
   public static final xo<uq, yv> a = yy.a(yv::a, yv::new);
   public static final yy.b<yv> b = yy.a("debug/brain");

   private yv(uq $$0) {
      this(new yv.a($$0));
   }

   private void a(uq $$0) {
      this.c.a($$0);
   }

   @Override
   public yy.b<yv> a() {
      return b;
   }

   public yv.a b() {
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
      ens h,
      String i,
      @Nullable ehe j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<hz> q,
      Set<hz> r
   ) {
      public a(uq $$0) {
         this(
            $$0.p(),
            $$0.readInt(),
            $$0.r(),
            $$0.r(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.r(),
            $$0.c(ehe::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(uq::r),
            $$0.a(uq::r),
            $$0.a(uq::r),
            $$0.a(uq::r),
            $$0.a(HashSet::new, hz.b),
            $$0.a(HashSet::new, hz.b)
         );
      }

      public void a(uq $$0) {
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
         $$0.a(this.m, uq::a);
         $$0.a(this.n, uq::a);
         $$0.a(this.o, uq::a);
         $$0.a(this.p, uq::a);
         $$0.a(this.q, hz.b);
         $$0.a(this.r, hz.b);
      }

      public boolean a(hz $$0) {
         return this.q.contains($$0);
      }

      public boolean b(hz $$0) {
         return this.r.contains($$0);
      }
   }
}
