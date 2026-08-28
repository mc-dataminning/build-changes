import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grl implements grb {
   protected final List<gem> a;
   protected final Map<je, List<gem>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gpa f;
   protected final gey g;
   protected final gew h;

   public grl(List<gem> $$0, Map<je, List<gem>> $$1, boolean $$2, boolean $$3, boolean $$4, gpa $$5, gey $$6, gew $$7) {
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
   public List<gem> a(@Nullable dsd $$0, @Nullable je $$1, azh $$2) {
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
   public gpa e() {
      return this.f;
   }

   @Override
   public gey f() {
      return this.g;
   }

   @Override
   public gew g() {
      return this.h;
   }

   public static class a {
      private final List<gem> a = Lists.newArrayList();
      private final Map<je, List<gem>> b = Maps.newEnumMap(je.class);
      private final gew c;
      private final boolean d;
      private gpa e;
      private final boolean f;
      private final boolean g;
      private final gey h;

      public a(ger $$0, gew $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gey $$3, gew $$4) {
         for (je $$5 : je.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grl.a a(je $$0, gem $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grl.a a(gem $$0) {
         this.a.add($$0);
         return this;
      }

      public grl.a a(gpa $$0) {
         this.e = $$0;
         return this;
      }

      public grl.a a() {
         return this;
      }

      public grb b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grl(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
