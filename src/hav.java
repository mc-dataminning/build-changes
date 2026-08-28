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

public class hav {
   private final has a;
   final hat b;
   private final hau c;
   private final Runnable d;
   private hav.c e;
   final List<hav.e> f = new ArrayList<>();

   public hav(has $$0, hat $$1, hau $$2, Runnable $$3, hav.c $$4) {
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
      for (hav.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hav.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hav.c.c) {
         this.b.a($$0, hat.a.a);
      } else {
         this.a($$0, new hav.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hav.c.c) {
         this.b.a($$0, hat.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hav.e $$5 = new hav.e($$0, $$2, null);
         $$5.f = hav.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hav.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hav.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hav.e $$0) {
      this.b.a($$0.a, hat.b.a);
      $$0.h = true;
   }

   @Nullable
   private hav.e c(UUID $$0) {
      for (hav.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hav.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hav.d.e);
         this.f();
      }
   }

   public void a() {
      for (hav.e $$0 : this.f) {
         $$0.a(hav.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hav.c.b;

      for (hav.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hav.c.c;

      for (hav.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hav.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hav.c.a;
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
         if ($$0.g != hav.a.a) {
            return false;
         } else if ($$0.e != null) {
            hat.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hav.e> $$0, atg.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hav.e $$2 : this.f) {
            if ($$2.g != hav.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hav.d.a);
               } else {
                  $$2.a(hav.d.d);
               }
            }
         }
      }

      for (hav.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hav.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hat.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hav.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hav.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hav.b.c) {
               $$1 = true;
            }

            if ($$2.f == hav.b.a) {
               $$2.f = hav.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atg.c> $$3 = new HashMap<>();

         for (hav.e $$4 : $$0) {
            $$3.put($$4.a, new atg.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hav.e> $$1 = new ArrayList<>();
      final List<hav.e> $$2 = new ArrayList<>();

      for (hav.e $$3 : this.f) {
         if ($$3.g == hav.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hav.b.c && !$$3.a();
         if ($$4 && $$3.g == hav.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hav.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hav.e $$5 : $$1) {
            if ($$5.g != hav.a.c) {
               $$5.g = hav.a.b;
            }
         }

         for (hav.e $$6 : $$2) {
            $$6.g = hav.a.b;
         }

         this.c.scheduleReload(new hau.a() {
            @Override
            public void a() {
               for (hav.e $$0 : $$1) {
                  $$0.g = hav.a.c;
                  if ($$0.e == null) {
                     hav.this.b.a($$0.a, hat.a.b);
                  }
               }

               for (hav.e $$1 : $$2) {
                  $$1.g = hav.a.a;
               }

               hav.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hav.e $$1 : hav.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hav.d.d);
                           break;
                        case b:
                           $$1.g = hav.a.a;
                           $$1.a(hav.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hav.this.f();
               } else {
                  for (hav.e $$2 : hav.this.f) {
                     if ($$2.g == hav.a.b) {
                        $$2.g = hav.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hau.b> b() {
               return $$1.stream().map($$0 -> new hau.b($$0.a, $$0.d)).toList();
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
      a(hat.a.d),
      b(hat.a.e),
      c(hat.a.a),
      d(hat.a.c),
      e(null),
      f(null);

      @Nullable
      final hat.a g;

      private d(@Nullable final hat.a $$0) {
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
      hav.d e;
      hav.b f = hav.b.a;
      hav.a g = hav.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hav.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
