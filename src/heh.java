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

public class heh {
   private final hee a;
   final hef b;
   private final heg c;
   private final Runnable d;
   private heh.c e;
   final List<heh.e> f = new ArrayList<>();

   public heh(hee $$0, hef $$1, heg $$2, Runnable $$3, heh.c $$4) {
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
      for (heh.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(heh.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == heh.c.c) {
         this.b.a($$0, hef.a.a);
      } else {
         this.a($$0, new heh.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == heh.c.c) {
         this.b.a($$0, hef.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         heh.e $$5 = new heh.e($$0, $$2, null);
         $$5.f = heh.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, heh.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == heh.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(heh.e $$0) {
      this.b.a($$0.a, hef.b.a);
      $$0.h = true;
   }

   @Nullable
   private heh.e c(UUID $$0) {
      for (heh.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      heh.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(heh.d.e);
         this.f();
      }
   }

   public void a() {
      for (heh.e $$0 : this.f) {
         $$0.a(heh.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = heh.c.b;

      for (heh.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = heh.c.c;

      for (heh.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(heh.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = heh.c.a;
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
         if ($$0.g != heh.a.a) {
            return false;
         } else if ($$0.e != null) {
            hef.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<heh.e> $$0, aub.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (heh.e $$2 : this.f) {
            if ($$2.g != heh.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(heh.d.a);
               } else {
                  $$2.a(heh.d.d);
               }
            }
         }
      }

      for (heh.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = heh.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hef.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<heh.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (heh.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != heh.b.c) {
               $$1 = true;
            }

            if ($$2.f == heh.b.a) {
               $$2.f = heh.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aub.c> $$3 = new HashMap<>();

         for (heh.e $$4 : $$0) {
            $$3.put($$4.a, new aub.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<heh.e> $$1 = new ArrayList<>();
      final List<heh.e> $$2 = new ArrayList<>();

      for (heh.e $$3 : this.f) {
         if ($$3.g == heh.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == heh.b.c && !$$3.a();
         if ($$4 && $$3.g == heh.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == heh.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (heh.e $$5 : $$1) {
            if ($$5.g != heh.a.c) {
               $$5.g = heh.a.b;
            }
         }

         for (heh.e $$6 : $$2) {
            $$6.g = heh.a.b;
         }

         this.c.scheduleReload(new heg.a() {
            @Override
            public void a() {
               for (heh.e $$0 : $$1) {
                  $$0.g = heh.a.c;
                  if ($$0.e == null) {
                     heh.this.b.a($$0.a, hef.a.b);
                  }
               }

               for (heh.e $$1 : $$2) {
                  $$1.g = heh.a.a;
               }

               heh.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (heh.e $$1 : heh.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(heh.d.d);
                           break;
                        case b:
                           $$1.g = heh.a.a;
                           $$1.a(heh.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  heh.this.f();
               } else {
                  for (heh.e $$2 : heh.this.f) {
                     if ($$2.g == heh.a.b) {
                        $$2.g = heh.a.a;
                     }
                  }
               }
            }

            @Override
            public List<heg.b> b() {
               return $$1.stream().map($$0 -> new heg.b($$0.a, $$0.d)).toList();
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
      a(hef.a.d),
      b(hef.a.e),
      c(hef.a.a),
      d(hef.a.c),
      e(null),
      f(null);

      @Nullable
      final hef.a g;

      private d(@Nullable final hef.a $$0) {
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
      heh.d e;
      heh.b f = heh.b.a;
      heh.a g = heh.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(heh.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
