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

public class gol {
   private final goi a;
   final goj b;
   private final gok c;
   private final Runnable d;
   private gol.c e;
   final List<gol.e> f = new ArrayList<>();

   public gol(goi $$0, goj $$1, gok $$2, Runnable $$3, gol.c $$4) {
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
      for (gol.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gol.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gol.c.c) {
         this.b.a($$0, goj.a.a);
      } else {
         this.a($$0, new gol.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gol.c.c) {
         this.b.a($$0, goj.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gol.e $$5 = new gol.e($$0, $$2, null);
         $$5.f = gol.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gol.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gol.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gol.e $$0) {
      this.b.a($$0.a, goj.b.a);
      $$0.h = true;
   }

   @Nullable
   private gol.e c(UUID $$0) {
      for (gol.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gol.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gol.d.e);
         this.f();
      }
   }

   public void a() {
      for (gol.e $$0 : this.f) {
         $$0.a(gol.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gol.c.b;

      for (gol.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gol.c.c;

      for (gol.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gol.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gol.c.a;
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
         if ($$0.g != gol.a.a) {
            return false;
         } else if ($$0.e != null) {
            goj.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gol.e> $$0, arl.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gol.e $$2 : this.f) {
            if ($$2.g != gol.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gol.d.a);
               } else {
                  $$2.a(gol.d.d);
               }
            }
         }
      }

      for (gol.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gol.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, goj.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gol.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gol.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gol.b.c) {
               $$1 = true;
            }

            if ($$2.f == gol.b.a) {
               $$2.f = gol.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, arl.c> $$3 = new HashMap<>();

         for (gol.e $$4 : $$0) {
            $$3.put($$4.a, new arl.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gol.e> $$1 = new ArrayList<>();
      final List<gol.e> $$2 = new ArrayList<>();

      for (gol.e $$3 : this.f) {
         if ($$3.g == gol.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gol.b.c && !$$3.a();
         if ($$4 && $$3.g == gol.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gol.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gol.e $$5 : $$1) {
            if ($$5.g != gol.a.c) {
               $$5.g = gol.a.b;
            }
         }

         for (gol.e $$6 : $$2) {
            $$6.g = gol.a.b;
         }

         this.c.scheduleReload(new gok.a() {
            @Override
            public void a() {
               for (gol.e $$0 : $$1) {
                  $$0.g = gol.a.c;
                  if ($$0.e == null) {
                     gol.this.b.a($$0.a, goj.a.b);
                  }
               }

               for (gol.e $$1 : $$2) {
                  $$1.g = gol.a.a;
               }

               gol.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gol.e $$1 : gol.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gol.a.a;
                           $$1.a(gol.d.b);
                           break;
                        case a:
                           $$1.a(gol.d.d);
                     }
                  }

                  gol.this.f();
               } else {
                  for (gol.e $$2 : gol.this.f) {
                     if ($$2.g == gol.a.b) {
                        $$2.g = gol.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gok.b> b() {
               return $$1.stream().map($$0 -> new gok.b($$0.a, $$0.d)).toList();
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
      a(goj.a.d),
      b(goj.a.e),
      c(goj.a.a),
      d(goj.a.c),
      e(null),
      f(null);

      @Nullable
      final goj.a g;

      private d(@Nullable goj.a $$0) {
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
      gol.d e;
      gol.b f = gol.b.a;
      gol.a g = gol.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gol.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
