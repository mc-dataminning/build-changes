import java.util.Set;
import javax.annotation.Nullable;

public class gpo implements gpw.a {
   public static final alg a = gpw.a;
   public static final alg b = alg.b("translucent");
   public static final alg c = alg.b("item_entity");
   public static final alg d = alg.b("particles");
   public static final alg e = alg.b("weather");
   public static final alg f = alg.b("clouds");
   public static final alg g = alg.b("entity_outline");
   public static final Set<alg> h = Set.of(a);
   public static final Set<alg> i = Set.of(a, g);
   public static final Set<alg> j = Set.of(a, b, c, d, e, f);
   public fio<fhm> k = fio.a();
   @Nullable
   public fio<fhm> l;
   @Nullable
   public fio<fhm> m;
   @Nullable
   public fio<fhm> n;
   @Nullable
   public fio<fhm> o;
   @Nullable
   public fio<fhm> p;
   @Nullable
   public fio<fhm> q;

   @Override
   public void a(alg $$0, fio<fhm> $$1) {
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
   public fio<fhm> a(alg $$0) {
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
      this.k = fio.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
