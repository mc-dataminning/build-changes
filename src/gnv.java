import java.util.Set;
import javax.annotation.Nullable;

public class gnv implements goc.a {
   public static final ald a = goc.a;
   public static final ald b = ald.b("translucent");
   public static final ald c = ald.b("item_entity");
   public static final ald d = ald.b("particles");
   public static final ald e = ald.b("weather");
   public static final ald f = ald.b("clouds");
   public static final ald g = ald.b("entity_outline");
   public static final Set<ald> h = Set.of(a);
   public static final Set<ald> i = Set.of(a, g);
   public static final Set<ald> j = Set.of(a, b, c, d, e, f);
   public fha<ffy> k = fha.a();
   @Nullable
   public fha<ffy> l;
   @Nullable
   public fha<ffy> m;
   @Nullable
   public fha<ffy> n;
   @Nullable
   public fha<ffy> o;
   @Nullable
   public fha<ffy> p;
   @Nullable
   public fha<ffy> q;

   @Override
   public void a(ald $$0, fha<ffy> $$1) {
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
   public fha<ffy> a(ald $$0) {
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
      this.k = fha.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
