import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ghl implements ghb {
   protected final List<fuq> a;
   protected final Map<ic, List<fuq>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gfb f;
   protected final fvc g;
   protected final fva h;

   public ghl(List<fuq> $$0, Map<ic, List<fuq>> $$1, boolean $$2, boolean $$3, boolean $$4, gfb $$5, fvc $$6, fva $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<fuq> a(@Nullable djp $$0, @Nullable ic $$1, auw $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gfb e() {
      return this.f;
   }

   @Override
   public fvc f() {
      return this.g;
   }

   @Override
   public fva g() {
      return this.h;
   }

   public static class a {
      private final List<fuq> a = Lists.newArrayList();
      private final Map<ic, List<fuq>> b = Maps.newEnumMap(ic.class);
      private final fva c;
      private final boolean d;
      private gfb e;
      private final boolean f;
      private final boolean g;
      private final fvc h;

      public a(fuv $$0, fva $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fvc $$3, fva $$4) {
         for (ic $$5 : ic.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public ghl.a a(ic $$0, fuq $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public ghl.a a(fuq $$0) {
         this.a.add($$0);
         return this;
      }

      public ghl.a a(gfb $$0) {
         this.e = $$0;
         return this;
      }

      public ghl.a a() {
         return this;
      }

      public ghb b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new ghl(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
