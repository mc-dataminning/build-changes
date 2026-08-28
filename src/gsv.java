import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gsv implements gsk {
   protected final List<gfu> a;
   protected final Map<ji, List<gfu>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gqj f;
   protected final ggg g;
   protected final gge h;

   public gsv(List<gfu> $$0, Map<ji, List<gfu>> $$1, boolean $$2, boolean $$3, boolean $$4, gqj $$5, ggg $$6, gge $$7) {
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
   public List<gfu> a(@Nullable dtc $$0, @Nullable ji $$1, ayw $$2) {
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
   public gqj e() {
      return this.f;
   }

   @Override
   public ggg f() {
      return this.g;
   }

   @Override
   public gge g() {
      return this.h;
   }

   public static class a {
      private final List<gfu> a = Lists.newArrayList();
      private final Map<ji, List<gfu>> b = Maps.newEnumMap(ji.class);
      private final gge c;
      private final boolean d;
      private gqj e;
      private final boolean f;
      private final boolean g;
      private final ggg h;

      public a(gfz $$0, gge $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, ggg $$3, gge $$4) {
         for (ji $$5 : ji.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gsv.a a(ji $$0, gfu $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gsv.a a(gfu $$0) {
         this.a.add($$0);
         return this;
      }

      public gsv.a a(gqj $$0) {
         this.e = $$0;
         return this;
      }

      public gsv.a a() {
         return this;
      }

      public gsk b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gsv(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
