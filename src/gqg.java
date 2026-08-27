import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gqg implements gpw {
   protected final List<gdh> a;
   protected final Map<it, List<gdh>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gnv f;
   protected final gdt g;
   protected final gdr h;

   public gqg(List<gdh> $$0, Map<it, List<gdh>> $$1, boolean $$2, boolean $$3, boolean $$4, gnv $$5, gdt $$6, gdr $$7) {
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
   public List<gdh> a(@Nullable drb $$0, @Nullable it $$1, ayk $$2) {
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
   public gnv e() {
      return this.f;
   }

   @Override
   public gdt f() {
      return this.g;
   }

   @Override
   public gdr g() {
      return this.h;
   }

   public static class a {
      private final List<gdh> a = Lists.newArrayList();
      private final Map<it, List<gdh>> b = Maps.newEnumMap(it.class);
      private final gdr c;
      private final boolean d;
      private gnv e;
      private final boolean f;
      private final boolean g;
      private final gdt h;

      public a(gdm $$0, gdr $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gdt $$3, gdr $$4) {
         for (it $$5 : it.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gqg.a a(it $$0, gdh $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gqg.a a(gdh $$0) {
         this.a.add($$0);
         return this;
      }

      public gqg.a a(gnv $$0) {
         this.e = $$0;
         return this;
      }

      public gqg.a a() {
         return this;
      }

      public gpw b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gqg(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
