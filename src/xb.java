import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xb(xb.a b) implements xd {
   public static final agi a = new agi("debug/brain");

   public xb(tu $$0) {
      this(new xb.a($$0));
   }

   @Override
   public void a(tu $$0) {
      this.b.a($$0);
   }

   @Override
   public agi a() {
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
      eju h,
      String i,
      @Nullable edh j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ht> q,
      Set<ht> r
   ) {
      public a(tu $$0) {
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
            $$0.c(edh::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(tu::s),
            $$0.a(tu::s),
            $$0.a(tu::s),
            $$0.a(tu::s),
            $$0.a(HashSet::new, tu::e),
            $$0.a(HashSet::new, tu::e)
         );
      }

      public void a(tu $$0) {
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
         $$0.a(this.m, tu::a);
         $$0.a(this.n, tu::a);
         $$0.a(this.o, tu::a);
         $$0.a(this.p, tu::a);
         $$0.a(this.q, tu::a);
         $$0.a(this.r, tu::a);
      }

      public boolean a(ht $$0) {
         return this.q.contains($$0);
      }

      public boolean b(ht $$0) {
         return this.r.contains($$0);
      }
   }
}
