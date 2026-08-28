import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zw(zw.a c) implements zz {
   public static final yn<vl, zw> a = zz.a(zw::a, zw::new);
   public static final zz.b<zw> b = zz.a("debug/brain");

   private zw(vl $$0) {
      this(new zw.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zz.b<zw> a() {
      return b;
   }

   public zw.a b() {
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
      fba h,
      String i,
      @Nullable etn j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ji> q,
      Set<ji> r
   ) {
      public a(vl $$0) {
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
            $$0.c(etn::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vl::p),
            $$0.a(vl::p),
            $$0.a(vl::p),
            $$0.a(vl::p),
            $$0.a(HashSet::new, ji.b),
            $$0.a(HashSet::new, ji.b)
         );
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.q(this.e);
         $$0.a(this.f);
         $$0.a(this.g);
         $$0.a(this.h);
         $$0.a(this.i);
         $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.k);
         $$0.q(this.l);
         $$0.a(this.m, vl::a);
         $$0.a(this.n, vl::a);
         $$0.a(this.o, vl::a);
         $$0.a(this.p, vl::a);
         $$0.a(this.q, ji.b);
         $$0.a(this.r, ji.b);
      }

      public boolean a(ji $$0) {
         return this.q.contains($$0);
      }

      public boolean b(ji $$0) {
         return this.r.contains($$0);
      }
   }
}
