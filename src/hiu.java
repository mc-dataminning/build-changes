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

public class hiu {
   private final hir a;
   final his b;
   private final hit c;
   private final Runnable d;
   private hiu.c e;
   final List<hiu.e> f = new ArrayList<>();

   public hiu(hir $$0, his $$1, hit $$2, Runnable $$3, hiu.c $$4) {
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
      for (hiu.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hiu.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hiu.c.c) {
         this.b.a($$0, his.a.a);
      } else {
         this.a($$0, new hiu.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hiu.c.c) {
         this.b.a($$0, his.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hiu.e $$5 = new hiu.e($$0, $$2, null);
         $$5.f = hiu.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hiu.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hiu.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hiu.e $$0) {
      this.b.a($$0.a, his.b.a);
      $$0.h = true;
   }

   @Nullable
   private hiu.e c(UUID $$0) {
      for (hiu.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hiu.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hiu.d.e);
         this.f();
      }
   }

   public void a() {
      for (hiu.e $$0 : this.f) {
         $$0.a(hiu.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hiu.c.b;

      for (hiu.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hiu.c.c;

      for (hiu.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hiu.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hiu.c.a;
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
         if ($$0.g != hiu.a.a) {
            return false;
         } else if ($$0.e != null) {
            his.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hiu.e> $$0, asx.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hiu.e $$2 : this.f) {
            if ($$2.g != hiu.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hiu.d.a);
               } else {
                  $$2.a(hiu.d.d);
               }
            }
         }
      }

      for (hiu.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hiu.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, his.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hiu.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hiu.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hiu.b.c) {
               $$1 = true;
            }

            if ($$2.f == hiu.b.a) {
               $$2.f = hiu.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asx.c> $$3 = new HashMap<>();

         for (hiu.e $$4 : $$0) {
            $$3.put($$4.a, new asx.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hiu.e> $$1 = new ArrayList<>();
      final List<hiu.e> $$2 = new ArrayList<>();

      for (hiu.e $$3 : this.f) {
         if ($$3.g == hiu.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hiu.b.c && !$$3.a();
         if ($$4 && $$3.g == hiu.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hiu.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hiu.e $$5 : $$1) {
            if ($$5.g != hiu.a.c) {
               $$5.g = hiu.a.b;
            }
         }

         for (hiu.e $$6 : $$2) {
            $$6.g = hiu.a.b;
         }

         this.c.scheduleReload(new hit.a() {
            @Override
            public void a() {
               for (hiu.e $$0 : $$1) {
                  $$0.g = hiu.a.c;
                  if ($$0.e == null) {
                     hiu.this.b.a($$0.a, his.a.b);
                  }
               }

               for (hiu.e $$1 : $$2) {
                  $$1.g = hiu.a.a;
               }

               hiu.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hiu.e $$1 : hiu.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hiu.d.d);
                           break;
                        case b:
                           $$1.g = hiu.a.a;
                           $$1.a(hiu.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hiu.this.f();
               } else {
                  for (hiu.e $$2 : hiu.this.f) {
                     if ($$2.g == hiu.a.b) {
                        $$2.g = hiu.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hit.b> b() {
               return $$1.stream().map($$0 -> new hit.b($$0.a, $$0.d)).toList();
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
      a(his.a.d),
      b(his.a.e),
      c(his.a.a),
      d(his.a.c),
      e(null),
      f(null);

      @Nullable
      final his.a g;

      private d(@Nullable final his.a $$0) {
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
      hiu.d e;
      hiu.b f = hiu.b.a;
      hiu.a g = hiu.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hiu.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
