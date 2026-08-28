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

public class hjv {
   private final hjs a;
   final hjt b;
   private final hju c;
   private final Runnable d;
   private hjv.c e;
   final List<hjv.e> f = new ArrayList<>();

   public hjv(hjs $$0, hjt $$1, hju $$2, Runnable $$3, hjv.c $$4) {
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
      for (hjv.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hjv.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hjv.c.c) {
         this.b.a($$0, hjt.a.a);
      } else {
         this.a($$0, new hjv.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hjv.c.c) {
         this.b.a($$0, hjt.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hjv.e $$5 = new hjv.e($$0, $$2, null);
         $$5.f = hjv.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hjv.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hjv.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hjv.e $$0) {
      this.b.a($$0.a, hjt.b.a);
      $$0.h = true;
   }

   @Nullable
   private hjv.e c(UUID $$0) {
      for (hjv.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hjv.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hjv.d.e);
         this.f();
      }
   }

   public void a() {
      for (hjv.e $$0 : this.f) {
         $$0.a(hjv.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hjv.c.b;

      for (hjv.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hjv.c.c;

      for (hjv.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hjv.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hjv.c.a;
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
         if ($$0.g != hjv.a.a) {
            return false;
         } else if ($$0.e != null) {
            hjt.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hjv.e> $$0, ath.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hjv.e $$2 : this.f) {
            if ($$2.g != hjv.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hjv.d.a);
               } else {
                  $$2.a(hjv.d.d);
               }
            }
         }
      }

      for (hjv.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hjv.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hjt.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hjv.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hjv.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hjv.b.c) {
               $$1 = true;
            }

            if ($$2.f == hjv.b.a) {
               $$2.f = hjv.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ath.c> $$3 = new HashMap<>();

         for (hjv.e $$4 : $$0) {
            $$3.put($$4.a, new ath.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hjv.e> $$1 = new ArrayList<>();
      final List<hjv.e> $$2 = new ArrayList<>();

      for (hjv.e $$3 : this.f) {
         if ($$3.g == hjv.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hjv.b.c && !$$3.a();
         if ($$4 && $$3.g == hjv.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hjv.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hjv.e $$5 : $$1) {
            if ($$5.g != hjv.a.c) {
               $$5.g = hjv.a.b;
            }
         }

         for (hjv.e $$6 : $$2) {
            $$6.g = hjv.a.b;
         }

         this.c.scheduleReload(new hju.a() {
            @Override
            public void a() {
               for (hjv.e $$0 : $$1) {
                  $$0.g = hjv.a.c;
                  if ($$0.e == null) {
                     hjv.this.b.a($$0.a, hjt.a.b);
                  }
               }

               for (hjv.e $$1 : $$2) {
                  $$1.g = hjv.a.a;
               }

               hjv.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hjv.e $$1 : hjv.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hjv.d.d);
                           break;
                        case b:
                           $$1.g = hjv.a.a;
                           $$1.a(hjv.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hjv.this.f();
               } else {
                  for (hjv.e $$2 : hjv.this.f) {
                     if ($$2.g == hjv.a.b) {
                        $$2.g = hjv.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hju.b> b() {
               return $$1.stream().map($$0 -> new hju.b($$0.a, $$0.d)).toList();
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
      a(hjt.a.d),
      b(hjt.a.e),
      c(hjt.a.a),
      d(hjt.a.c),
      e(null),
      f(null);

      @Nullable
      final hjt.a g;

      private d(@Nullable final hjt.a $$0) {
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
      hjv.d e;
      hjv.b f = hjv.b.a;
      hjv.a g = hjv.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hjv.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
