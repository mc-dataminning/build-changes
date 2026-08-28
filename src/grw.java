import java.util.Set;
import javax.annotation.Nullable;

public class grw implements gse.a {
   public static final ali a = gse.a;
   public static final ali b = ali.b("translucent");
   public static final ali c = ali.b("item_entity");
   public static final ali d = ali.b("particles");
   public static final ali e = ali.b("weather");
   public static final ali f = ali.b("clouds");
   public static final ali g = ali.b("entity_outline");
   public static final Set<ali> h = Set.of(a);
   public static final Set<ali> i = Set.of(a, g);
   public static final Set<ali> j = Set.of(a, b, c, d, e, f);
   public fkt<fjq> k = fkt.a();
   @Nullable
   public fkt<fjq> l;
   @Nullable
   public fkt<fjq> m;
   @Nullable
   public fkt<fjq> n;
   @Nullable
   public fkt<fjq> o;
   @Nullable
   public fkt<fjq> p;
   @Nullable
   public fkt<fjq> q;

   @Override
   public void a(ali $$0, fkt<fjq> $$1) {
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
   public fkt<fjq> a(ali $$0) {
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
      this.k = fkt.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
