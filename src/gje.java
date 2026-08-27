import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gje implements giu {
   protected final List<fwj> a;
   protected final Map<ie, List<fwj>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final ggu f;
   protected final fwv g;
   protected final fwt h;

   public gje(List<fwj> $$0, Map<ie, List<fwj>> $$1, boolean $$2, boolean $$3, boolean $$4, ggu $$5, fwv $$6, fwt $$7) {
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
   public List<fwj> a(@Nullable dlf $$0, @Nullable ie $$1, awo $$2) {
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
   public ggu e() {
      return this.f;
   }

   @Override
   public fwv f() {
      return this.g;
   }

   @Override
   public fwt g() {
      return this.h;
   }

   public static class a {
      private final List<fwj> a = Lists.newArrayList();
      private final Map<ie, List<fwj>> b = Maps.newEnumMap(ie.class);
      private final fwt c;
      private final boolean d;
      private ggu e;
      private final boolean f;
      private final boolean g;
      private final fwv h;

      public a(fwo $$0, fwt $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fwv $$3, fwt $$4) {
         for (ie $$5 : ie.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gje.a a(ie $$0, fwj $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gje.a a(fwj $$0) {
         this.a.add($$0);
         return this;
      }

      public gje.a a(ggu $$0) {
         this.e = $$0;
         return this;
      }

      public gje.a a() {
         return this;
      }

      public giu b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gje(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
