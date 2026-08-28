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

public class hag {
   private final had a;
   final hae b;
   private final haf c;
   private final Runnable d;
   private hag.c e;
   final List<hag.e> f = new ArrayList<>();

   public hag(had $$0, hae $$1, haf $$2, Runnable $$3, hag.c $$4) {
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
      for (hag.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hag.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hag.c.c) {
         this.b.a($$0, hae.a.a);
      } else {
         this.a($$0, new hag.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hag.c.c) {
         this.b.a($$0, hae.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hag.e $$5 = new hag.e($$0, $$2, null);
         $$5.f = hag.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hag.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hag.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hag.e $$0) {
      this.b.a($$0.a, hae.b.a);
      $$0.h = true;
   }

   @Nullable
   private hag.e c(UUID $$0) {
      for (hag.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hag.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hag.d.e);
         this.f();
      }
   }

   public void a() {
      for (hag.e $$0 : this.f) {
         $$0.a(hag.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hag.c.b;

      for (hag.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hag.c.c;

      for (hag.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hag.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hag.c.a;
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
         if ($$0.g != hag.a.a) {
            return false;
         } else if ($$0.e != null) {
            hae.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hag.e> $$0, atc.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hag.e $$2 : this.f) {
            if ($$2.g != hag.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hag.d.a);
               } else {
                  $$2.a(hag.d.d);
               }
            }
         }
      }

      for (hag.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hag.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hae.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hag.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hag.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hag.b.c) {
               $$1 = true;
            }

            if ($$2.f == hag.b.a) {
               $$2.f = hag.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atc.c> $$3 = new HashMap<>();

         for (hag.e $$4 : $$0) {
            $$3.put($$4.a, new atc.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hag.e> $$1 = new ArrayList<>();
      final List<hag.e> $$2 = new ArrayList<>();

      for (hag.e $$3 : this.f) {
         if ($$3.g == hag.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hag.b.c && !$$3.a();
         if ($$4 && $$3.g == hag.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hag.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hag.e $$5 : $$1) {
            if ($$5.g != hag.a.c) {
               $$5.g = hag.a.b;
            }
         }

         for (hag.e $$6 : $$2) {
            $$6.g = hag.a.b;
         }

         this.c.scheduleReload(new haf.a() {
            @Override
            public void a() {
               for (hag.e $$0 : $$1) {
                  $$0.g = hag.a.c;
                  if ($$0.e == null) {
                     hag.this.b.a($$0.a, hae.a.b);
                  }
               }

               for (hag.e $$1 : $$2) {
                  $$1.g = hag.a.a;
               }

               hag.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hag.e $$1 : hag.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hag.d.d);
                           break;
                        case b:
                           $$1.g = hag.a.a;
                           $$1.a(hag.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hag.this.f();
               } else {
                  for (hag.e $$2 : hag.this.f) {
                     if ($$2.g == hag.a.b) {
                        $$2.g = hag.a.a;
                     }
                  }
               }
            }

            @Override
            public List<haf.b> b() {
               return $$1.stream().map($$0 -> new haf.b($$0.a, $$0.d)).toList();
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
      a(hae.a.d),
      b(hae.a.e),
      c(hae.a.a),
      d(hae.a.c),
      e(null),
      f(null);

      @Nullable
      final hae.a g;

      private d(@Nullable final hae.a $$0) {
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
      hag.d e;
      hag.b f = hag.b.a;
      hag.a g = hag.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hag.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
