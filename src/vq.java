import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vq(vq.a b) implements vs {
   public static final aeu a = new aeu("debug/brain");

   public vq(sl $$0) {
      this(new vq.a($$0));
   }

   @Override
   public void a(sl $$0) {
      this.b.a($$0);
   }

   @Override
   public aeu a() {
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
      ehi h,
      String i,
      @Nullable eaw j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<gw> q,
      Set<gw> r
   ) {
      public a(sl $$0) {
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
            $$0.c(eaw::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(sl::r),
            $$0.a(sl::r),
            $$0.a(sl::r),
            $$0.a(sl::r),
            $$0.a(HashSet::new, sl::e),
            $$0.a(HashSet::new, sl::e)
         );
      }

      public void a(sl $$0) {
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
         $$0.a(this.m, sl::a);
         $$0.a(this.n, sl::a);
         $$0.a(this.o, sl::a);
         $$0.a(this.p, sl::a);
         $$0.a(this.q, sl::a);
         $$0.a(this.r, sl::a);
      }

      public boolean a(gw $$0) {
         return this.q.contains($$0);
      }

      public boolean b(gw $$0) {
         return this.r.contains($$0);
      }
   }
}
