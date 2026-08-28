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

public class heo {
   private final hel a;
   final hem b;
   private final hen c;
   private final Runnable d;
   private heo.c e;
   final List<heo.e> f = new ArrayList<>();

   public heo(hel $$0, hem $$1, hen $$2, Runnable $$3, heo.c $$4) {
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
      for (heo.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(heo.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == heo.c.c) {
         this.b.a($$0, hem.a.a);
      } else {
         this.a($$0, new heo.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == heo.c.c) {
         this.b.a($$0, hem.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         heo.e $$5 = new heo.e($$0, $$2, null);
         $$5.f = heo.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, heo.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == heo.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(heo.e $$0) {
      this.b.a($$0.a, hem.b.a);
      $$0.h = true;
   }

   @Nullable
   private heo.e c(UUID $$0) {
      for (heo.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      heo.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(heo.d.e);
         this.f();
      }
   }

   public void a() {
      for (heo.e $$0 : this.f) {
         $$0.a(heo.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = heo.c.b;

      for (heo.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = heo.c.c;

      for (heo.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(heo.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = heo.c.a;
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
         if ($$0.g != heo.a.a) {
            return false;
         } else if ($$0.e != null) {
            hem.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<heo.e> $$0, aub.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (heo.e $$2 : this.f) {
            if ($$2.g != heo.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(heo.d.a);
               } else {
                  $$2.a(heo.d.d);
               }
            }
         }
      }

      for (heo.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = heo.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hem.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<heo.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (heo.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != heo.b.c) {
               $$1 = true;
            }

            if ($$2.f == heo.b.a) {
               $$2.f = heo.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aub.c> $$3 = new HashMap<>();

         for (heo.e $$4 : $$0) {
            $$3.put($$4.a, new aub.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<heo.e> $$1 = new ArrayList<>();
      final List<heo.e> $$2 = new ArrayList<>();

      for (heo.e $$3 : this.f) {
         if ($$3.g == heo.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == heo.b.c && !$$3.a();
         if ($$4 && $$3.g == heo.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == heo.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (heo.e $$5 : $$1) {
            if ($$5.g != heo.a.c) {
               $$5.g = heo.a.b;
            }
         }

         for (heo.e $$6 : $$2) {
            $$6.g = heo.a.b;
         }

         this.c.scheduleReload(new hen.a() {
            @Override
            public void a() {
               for (heo.e $$0 : $$1) {
                  $$0.g = heo.a.c;
                  if ($$0.e == null) {
                     heo.this.b.a($$0.a, hem.a.b);
                  }
               }

               for (heo.e $$1 : $$2) {
                  $$1.g = heo.a.a;
               }

               heo.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (heo.e $$1 : heo.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(heo.d.d);
                           break;
                        case b:
                           $$1.g = heo.a.a;
                           $$1.a(heo.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  heo.this.f();
               } else {
                  for (heo.e $$2 : heo.this.f) {
                     if ($$2.g == heo.a.b) {
                        $$2.g = heo.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hen.b> b() {
               return $$1.stream().map($$0 -> new hen.b($$0.a, $$0.d)).toList();
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
      a(hem.a.d),
      b(hem.a.e),
      c(hem.a.a),
      d(hem.a.c),
      e(null),
      f(null);

      @Nullable
      final hem.a g;

      private d(@Nullable final hem.a $$0) {
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
      heo.d e;
      heo.b f = heo.b.a;
      heo.a g = heo.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(heo.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
