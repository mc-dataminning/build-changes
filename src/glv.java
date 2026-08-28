import java.util.Set;
import javax.annotation.Nullable;

public class glv implements gmc.a {
   public static final akv a = gmc.a;
   public static final akv b = akv.b("translucent");
   public static final akv c = akv.b("item_entity");
   public static final akv d = akv.b("particles");
   public static final akv e = akv.b("weather");
   public static final akv f = akv.b("clouds");
   public static final akv g = akv.b("entity_outline");
   public static final Set<akv> h = Set.of(a);
   public static final Set<akv> i = Set.of(a, g);
   public static final Set<akv> j = Set.of(a, b, c, d, e, f);
   public ffg<fee> k = ffg.a();
   @Nullable
   public ffg<fee> l;
   @Nullable
   public ffg<fee> m;
   @Nullable
   public ffg<fee> n;
   @Nullable
   public ffg<fee> o;
   @Nullable
   public ffg<fee> p;
   @Nullable
   public ffg<fee> q;

   @Override
   public void a(akv $$0, ffg<fee> $$1) {
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
   public ffg<fee> a(akv $$0) {
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
      this.k = ffg.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
