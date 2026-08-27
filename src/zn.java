import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zn(zn.a c) implements zq {
   public static final yg<vi, zn> a = zq.a(zn::a, zn::new);
   public static final zq.b<zn> b = zq.a("debug/brain");

   private zn(vi $$0) {
      this(new zn.a($$0));
   }

   private void a(vi $$0) {
      this.c.a($$0);
   }

   @Override
   public zq.b<zn> a() {
      return b;
   }

   public zn.a b() {
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
      esj h,
      String i,
      @Nullable elp j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<id> q,
      Set<id> r
   ) {
      public a(vi $$0) {
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
            $$0.c(elp::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vi::p),
            $$0.a(vi::p),
            $$0.a(vi::p),
            $$0.a(vi::p),
            $$0.a(HashSet::new, id.b),
            $$0.a(HashSet::new, id.b)
         );
      }

      public void a(vi $$0) {
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
         $$0.a(this.m, vi::a);
         $$0.a(this.n, vi::a);
         $$0.a(this.o, vi::a);
         $$0.a(this.p, vi::a);
         $$0.a(this.q, id.b);
         $$0.a(this.r, id.b);
      }

      public boolean a(id $$0) {
         return this.q.contains($$0);
      }

      public boolean b(id $$0) {
         return this.r.contains($$0);
      }
   }
}
