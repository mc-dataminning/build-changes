import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class gzk {
   private final gzh a;
   final gzi b;
   private final gzj c;
   private final Runnable d;
   private gzk.c e;
   final List<gzk.e> f = new ArrayList<>();

   public gzk(gzh $$0, gzi $$1, gzj $$2, Runnable $$3, gzk.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (gzk.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gzk.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gzk.c.c) {
         this.b.a($$0, gzi.a.a);
      } else {
         this.a($$0, new gzk.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gzk.c.c) {
         this.b.a($$0, gzi.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gzk.e $$5 = new gzk.e($$0, $$2, null);
         $$5.f = gzk.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gzk.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gzk.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gzk.e $$0) {
      this.b.a($$0.a, gzi.b.a);
      $$0.h = true;
   }

   @Nullable
   private gzk.e c(UUID $$0) {
      for (gzk.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gzk.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gzk.d.e);
         this.f();
      }
   }

   public void a() {
      for (gzk.e $$0 : this.f) {
         $$0.a(gzk.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gzk.c.b;

      for (gzk.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gzk.c.c;

      for (gzk.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gzk.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gzk.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != gzk.a.a) {
            return false;
         } else if ($$0.e != null) {
            gzi.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gzk.e> $$0, asz.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gzk.e $$2 : this.f) {
            if ($$2.g != gzk.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gzk.d.a);
               } else {
                  $$2.a(gzk.d.d);
               }
            }
         }
      }

      for (gzk.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gzk.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gzi.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gzk.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gzk.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gzk.b.c) {
               $$1 = true;
            }

            if ($$2.f == gzk.b.a) {
               $$2.f = gzk.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asz.c> $$3 = new HashMap<>();

         for (gzk.e $$4 : $$0) {
            $$3.put($$4.a, new asz.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gzk.e> $$1 = new ArrayList<>();
      final List<gzk.e> $$2 = new ArrayList<>();

      for (gzk.e $$3 : this.f) {
         if ($$3.g == gzk.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gzk.b.c && !$$3.a();
         if ($$4 && $$3.g == gzk.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gzk.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gzk.e $$5 : $$1) {
            if ($$5.g != gzk.a.c) {
               $$5.g = gzk.a.b;
            }
         }

         for (gzk.e $$6 : $$2) {
            $$6.g = gzk.a.b;
         }

         this.c.scheduleReload(new gzj.a() {
            @Override
            public void a() {
               for (gzk.e $$0 : $$1) {
                  $$0.g = gzk.a.c;
                  if ($$0.e == null) {
                     gzk.this.b.a($$0.a, gzi.a.b);
                  }
               }

               for (gzk.e $$1 : $$2) {
                  $$1.g = gzk.a.a;
               }

               gzk.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gzk.e $$1 : gzk.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gzk.d.d);
                           break;
                        case b:
                           $$1.g = gzk.a.a;
                           $$1.a(gzk.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gzk.this.f();
               } else {
                  for (gzk.e $$2 : gzk.this.f) {
                     if ($$2.g == gzk.a.b) {
                        $$2.g = gzk.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gzj.b> b() {
               return $$1.stream().map($$0 -> new gzj.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(gzi.a.d),
      b(gzi.a.e),
      c(gzi.a.a),
      d(gzi.a.c),
      e(null),
      f(null);

      @Nullable
      final gzi.a g;

      private d(@Nullable final gzi.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      gzk.d e;
      gzk.b f = gzk.b.a;
      gzk.a g = gzk.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gzk.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
