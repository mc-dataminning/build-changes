import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grj implements gqz {
   protected final List<gek> a;
   protected final Map<je, List<gek>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final goy f;
   protected final gew g;
   protected final geu h;

   public grj(List<gek> $$0, Map<je, List<gek>> $$1, boolean $$2, boolean $$3, boolean $$4, goy $$5, gew $$6, geu $$7) {
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
   public List<gek> a(@Nullable dsb $$0, @Nullable je $$1, azg $$2) {
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
   public goy e() {
      return this.f;
   }

   @Override
   public gew f() {
      return this.g;
   }

   @Override
   public geu g() {
      return this.h;
   }

   public static class a {
      private final List<gek> a = Lists.newArrayList();
      private final Map<je, List<gek>> b = Maps.newEnumMap(je.class);
      private final geu c;
      private final boolean d;
      private goy e;
      private final boolean f;
      private final boolean g;
      private final gew h;

      public a(gep $$0, geu $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gew $$3, geu $$4) {
         for (je $$5 : je.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grj.a a(je $$0, gek $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grj.a a(gek $$0) {
         this.a.add($$0);
         return this;
      }

      public grj.a a(goy $$0) {
         this.e = $$0;
         return this;
      }

      public grj.a a() {
         return this;
      }

      public gqz b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grj(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
