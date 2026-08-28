import java.util.Set;
import javax.annotation.Nullable;

public class gld implements glk.a {
   public static final alp a = glk.a;
   public static final alp b = alp.b("translucent");
   public static final alp c = alp.b("item_entity");
   public static final alp d = alp.b("particles");
   public static final alp e = alp.b("weather");
   public static final alp f = alp.b("clouds");
   public static final alp g = alp.b("entity_outline");
   public static final Set<alp> h = Set.of(a);
   public static final Set<alp> i = Set.of(a, g);
   public static final Set<alp> j = Set.of(a, b, c, d, e, f);
   public ffx<fev> k = ffx.a();
   @Nullable
   public ffx<fev> l;
   @Nullable
   public ffx<fev> m;
   @Nullable
   public ffx<fev> n;
   @Nullable
   public ffx<fev> o;
   @Nullable
   public ffx<fev> p;
   @Nullable
   public ffx<fev> q;

   @Override
   public void a(alp $$0, ffx<fev> $$1) {
      if ($$0.equals(a)) {
         this.k = $$1;
      } else if ($$0.equals(b)) {
         this.l = $$1;
      } else if ($$0.equals(c)) {
         this.m = $$1;
      } else if ($$0.equals(d)) {
         this.n = $$1;
      } else if ($$0.equals(e)) {
         this.o = $$1;
      } else if ($$0.equals(f)) {
         this.p = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.q = $$1;
      }
   }

   @Nullable
   @Override
   public ffx<fev> a(alp $$0) {
      if ($$0.equals(a)) {
         return this.k;
      } else if ($$0.equals(b)) {
         return this.l;
      } else if ($$0.equals(c)) {
         return this.m;
      } else if ($$0.equals(d)) {
         return this.n;
      } else if ($$0.equals(e)) {
         return this.o;
      } else if ($$0.equals(f)) {
         return this.p;
      } else {
         return $$0.equals(g) ? this.q : null;
      }
   }

   public void a() {
      this.k = ffx.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
