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

public class hej {
   private final heg a;
   final heh b;
   private final hei c;
   private final Runnable d;
   private hej.c e;
   final List<hej.e> f = new ArrayList<>();

   public hej(heg $$0, heh $$1, hei $$2, Runnable $$3, hej.c $$4) {
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
      for (hej.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hej.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hej.c.c) {
         this.b.a($$0, heh.a.a);
      } else {
         this.a($$0, new hej.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hej.c.c) {
         this.b.a($$0, heh.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hej.e $$5 = new hej.e($$0, $$2, null);
         $$5.f = hej.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hej.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hej.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hej.e $$0) {
      this.b.a($$0.a, heh.b.a);
      $$0.h = true;
   }

   @Nullable
   private hej.e c(UUID $$0) {
      for (hej.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hej.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hej.d.e);
         this.f();
      }
   }

   public void a() {
      for (hej.e $$0 : this.f) {
         $$0.a(hej.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hej.c.b;

      for (hej.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hej.c.c;

      for (hej.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hej.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hej.c.a;
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
         if ($$0.g != hej.a.a) {
            return false;
         } else if ($$0.e != null) {
            heh.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hej.e> $$0, atr.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hej.e $$2 : this.f) {
            if ($$2.g != hej.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hej.d.a);
               } else {
                  $$2.a(hej.d.d);
               }
            }
         }
      }

      for (hej.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hej.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, heh.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hej.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hej.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hej.b.c) {
               $$1 = true;
            }

            if ($$2.f == hej.b.a) {
               $$2.f = hej.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atr.c> $$3 = new HashMap<>();

         for (hej.e $$4 : $$0) {
            $$3.put($$4.a, new atr.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hej.e> $$1 = new ArrayList<>();
      final List<hej.e> $$2 = new ArrayList<>();

      for (hej.e $$3 : this.f) {
         if ($$3.g == hej.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hej.b.c && !$$3.a();
         if ($$4 && $$3.g == hej.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hej.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hej.e $$5 : $$1) {
            if ($$5.g != hej.a.c) {
               $$5.g = hej.a.b;
            }
         }

         for (hej.e $$6 : $$2) {
            $$6.g = hej.a.b;
         }

         this.c.scheduleReload(new hei.a() {
            @Override
            public void a() {
               for (hej.e $$0 : $$1) {
                  $$0.g = hej.a.c;
                  if ($$0.e == null) {
                     hej.this.b.a($$0.a, heh.a.b);
                  }
               }

               for (hej.e $$1 : $$2) {
                  $$1.g = hej.a.a;
               }

               hej.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hej.e $$1 : hej.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hej.d.d);
                           break;
                        case b:
                           $$1.g = hej.a.a;
                           $$1.a(hej.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hej.this.f();
               } else {
                  for (hej.e $$2 : hej.this.f) {
                     if ($$2.g == hej.a.b) {
                        $$2.g = hej.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hei.b> b() {
               return $$1.stream().map($$0 -> new hei.b($$0.a, $$0.d)).toList();
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
      a(heh.a.d),
      b(heh.a.e),
      c(heh.a.a),
      d(heh.a.c),
      e(null),
      f(null);

      @Nullable
      final heh.a g;

      private d(@Nullable final heh.a $$0) {
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
      hej.d e;
      hej.b f = hej.b.a;
      hej.a g = hej.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hej.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
