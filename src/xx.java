import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xx(xx.a b) implements ya {
   public static final ahg a = new ahg("debug/brain");

   public xx(ui $$0) {
      this(new xx.a($$0));
   }

   @Override
   public void a(ui $$0) {
      this.b.a($$0);
   }

   @Override
   public ahg a() {
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
      elt h,
      String i,
      @Nullable efg j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<hx> q,
      Set<hx> r
   ) {
      public a(ui $$0) {
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
            $$0.c(efg::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(ui::s),
            $$0.a(ui::s),
            $$0.a(ui::s),
            $$0.a(ui::s),
            $$0.a(HashSet::new, ui::e),
            $$0.a(HashSet::new, ui::e)
         );
      }

      public void a(ui $$0) {
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
         $$0.a(this.m, ui::a);
         $$0.a(this.n, ui::a);
         $$0.a(this.o, ui::a);
         $$0.a(this.p, ui::a);
         $$0.a(this.q, ui::a);
         $$0.a(this.r, ui::a);
      }

      public boolean a(hx $$0) {
         return this.q.contains($$0);
      }

      public boolean b(hx $$0) {
         return this.r.contains($$0);
      }
   }
}
