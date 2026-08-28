import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grm implements grc {
   protected final List<gen> a;
   protected final Map<je, List<gen>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gpb f;
   protected final gez g;
   protected final gex h;

   public grm(List<gen> $$0, Map<je, List<gen>> $$1, boolean $$2, boolean $$3, boolean $$4, gpb $$5, gez $$6, gex $$7) {
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
   public List<gen> a(@Nullable dse $$0, @Nullable je $$1, azh $$2) {
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
   public gpb e() {
      return this.f;
   }

   @Override
   public gez f() {
      return this.g;
   }

   @Override
   public gex g() {
      return this.h;
   }

   public static class a {
      private final List<gen> a = Lists.newArrayList();
      private final Map<je, List<gen>> b = Maps.newEnumMap(je.class);
      private final gex c;
      private final boolean d;
      private gpb e;
      private final boolean f;
      private final boolean g;
      private final gez h;

      public a(ges $$0, gex $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gez $$3, gex $$4) {
         for (je $$5 : je.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grm.a a(je $$0, gen $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grm.a a(gen $$0) {
         this.a.add($$0);
         return this;
      }

      public grm.a a(gpb $$0) {
         this.e = $$0;
         return this;
      }

      public grm.a a() {
         return this;
      }

      public grc b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grm(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
