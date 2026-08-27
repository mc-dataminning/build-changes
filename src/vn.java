import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vn(vn.a b) implements vp {
   public static final aer a = new aer("debug/brain");

   public vn(si $$0) {
      this(new vn.a($$0));
   }

   @Override
   public void a(si $$0) {
      this.b.a($$0);
   }

   @Override
   public aer a() {
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
      ehe h,
      String i,
      @Nullable eas j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<gu> q,
      Set<gu> r
   ) {
      public a(si $$0) {
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
            $$0.c(eas::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(si::r),
            $$0.a(si::r),
            $$0.a(si::r),
            $$0.a(si::r),
            $$0.a(HashSet::new, si::e),
            $$0.a(HashSet::new, si::e)
         );
      }

      public void a(si $$0) {
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
         $$0.a(this.m, si::a);
         $$0.a(this.n, si::a);
         $$0.a(this.o, si::a);
         $$0.a(this.p, si::a);
         $$0.a(this.q, si::a);
         $$0.a(this.r, si::a);
      }

      public boolean a(gu $$0) {
         return this.q.contains($$0);
      }

      public boolean b(gu $$0) {
         return this.r.contains($$0);
      }
   }
}
