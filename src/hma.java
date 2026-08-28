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

public class hma {
   private final hlx a;
   final hly b;
   private final hlz c;
   private final Runnable d;
   private hma.c e;
   final List<hma.e> f = new ArrayList<>();

   public hma(hlx $$0, hly $$1, hlz $$2, Runnable $$3, hma.c $$4) {
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
      for (hma.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hma.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hma.c.c) {
         this.b.a($$0, hly.a.a);
      } else {
         this.a($$0, new hma.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hma.c.c) {
         this.b.a($$0, hly.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hma.e $$5 = new hma.e($$0, $$2, null);
         $$5.f = hma.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hma.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hma.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hma.e $$0) {
      this.b.a($$0.a, hly.b.a);
      $$0.h = true;
   }

   @Nullable
   private hma.e c(UUID $$0) {
      for (hma.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hma.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hma.d.e);
         this.f();
      }
   }

   public void a() {
      for (hma.e $$0 : this.f) {
         $$0.a(hma.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hma.c.b;

      for (hma.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hma.c.c;

      for (hma.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hma.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hma.c.a;
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
         if ($$0.g != hma.a.a) {
            return false;
         } else if ($$0.e != null) {
            hly.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hma.e> $$0, atk.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hma.e $$2 : this.f) {
            if ($$2.g != hma.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hma.d.a);
               } else {
                  $$2.a(hma.d.d);
               }
            }
         }
      }

      for (hma.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hma.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hly.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hma.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hma.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hma.b.c) {
               $$1 = true;
            }

            if ($$2.f == hma.b.a) {
               $$2.f = hma.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atk.c> $$3 = new HashMap<>();

         for (hma.e $$4 : $$0) {
            $$3.put($$4.a, new atk.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hma.e> $$1 = new ArrayList<>();
      final List<hma.e> $$2 = new ArrayList<>();

      for (hma.e $$3 : this.f) {
         if ($$3.g == hma.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hma.b.c && !$$3.a();
         if ($$4 && $$3.g == hma.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hma.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hma.e $$5 : $$1) {
            if ($$5.g != hma.a.c) {
               $$5.g = hma.a.b;
            }
         }

         for (hma.e $$6 : $$2) {
            $$6.g = hma.a.b;
         }

         this.c.scheduleReload(new hlz.a() {
            @Override
            public void a() {
               for (hma.e $$0 : $$1) {
                  $$0.g = hma.a.c;
                  if ($$0.e == null) {
                     hma.this.b.a($$0.a, hly.a.b);
                  }
               }

               for (hma.e $$1 : $$2) {
                  $$1.g = hma.a.a;
               }

               hma.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hma.e $$1 : hma.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hma.d.d);
                           break;
                        case b:
                           $$1.g = hma.a.a;
                           $$1.a(hma.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hma.this.f();
               } else {
                  for (hma.e $$2 : hma.this.f) {
                     if ($$2.g == hma.a.b) {
                        $$2.g = hma.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hlz.b> b() {
               return $$1.stream().map($$0 -> new hlz.b($$0.a, $$0.d)).toList();
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
      a(hly.a.d),
      b(hly.a.e),
      c(hly.a.a),
      d(hly.a.c),
      e(null),
      f(null);

      @Nullable
      final hly.a g;

      private d(@Nullable final hly.a $$0) {
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
      hma.d e;
      hma.b f = hma.b.a;
      hma.a g = hma.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hma.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
