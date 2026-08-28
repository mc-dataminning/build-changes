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

public class hhv {
   private final hhs a;
   final hht b;
   private final hhu c;
   private final Runnable d;
   private hhv.c e;
   final List<hhv.e> f = new ArrayList<>();

   public hhv(hhs $$0, hht $$1, hhu $$2, Runnable $$3, hhv.c $$4) {
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
      for (hhv.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hhv.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hhv.c.c) {
         this.b.a($$0, hht.a.a);
      } else {
         this.a($$0, new hhv.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hhv.c.c) {
         this.b.a($$0, hht.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hhv.e $$5 = new hhv.e($$0, $$2, null);
         $$5.f = hhv.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hhv.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hhv.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hhv.e $$0) {
      this.b.a($$0.a, hht.b.a);
      $$0.h = true;
   }

   @Nullable
   private hhv.e c(UUID $$0) {
      for (hhv.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hhv.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hhv.d.e);
         this.f();
      }
   }

   public void a() {
      for (hhv.e $$0 : this.f) {
         $$0.a(hhv.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hhv.c.b;

      for (hhv.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hhv.c.c;

      for (hhv.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hhv.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hhv.c.a;
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
         if ($$0.g != hhv.a.a) {
            return false;
         } else if ($$0.e != null) {
            hht.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hhv.e> $$0, asx.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hhv.e $$2 : this.f) {
            if ($$2.g != hhv.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hhv.d.a);
               } else {
                  $$2.a(hhv.d.d);
               }
            }
         }
      }

      for (hhv.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hhv.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hht.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hhv.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hhv.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hhv.b.c) {
               $$1 = true;
            }

            if ($$2.f == hhv.b.a) {
               $$2.f = hhv.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asx.c> $$3 = new HashMap<>();

         for (hhv.e $$4 : $$0) {
            $$3.put($$4.a, new asx.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hhv.e> $$1 = new ArrayList<>();
      final List<hhv.e> $$2 = new ArrayList<>();

      for (hhv.e $$3 : this.f) {
         if ($$3.g == hhv.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hhv.b.c && !$$3.a();
         if ($$4 && $$3.g == hhv.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hhv.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hhv.e $$5 : $$1) {
            if ($$5.g != hhv.a.c) {
               $$5.g = hhv.a.b;
            }
         }

         for (hhv.e $$6 : $$2) {
            $$6.g = hhv.a.b;
         }

         this.c.scheduleReload(new hhu.a() {
            @Override
            public void a() {
               for (hhv.e $$0 : $$1) {
                  $$0.g = hhv.a.c;
                  if ($$0.e == null) {
                     hhv.this.b.a($$0.a, hht.a.b);
                  }
               }

               for (hhv.e $$1 : $$2) {
                  $$1.g = hhv.a.a;
               }

               hhv.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hhv.e $$1 : hhv.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hhv.d.d);
                           break;
                        case b:
                           $$1.g = hhv.a.a;
                           $$1.a(hhv.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hhv.this.f();
               } else {
                  for (hhv.e $$2 : hhv.this.f) {
                     if ($$2.g == hhv.a.b) {
                        $$2.g = hhv.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hhu.b> b() {
               return $$1.stream().map($$0 -> new hhu.b($$0.a, $$0.d)).toList();
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
      a(hht.a.d),
      b(hht.a.e),
      c(hht.a.a),
      d(hht.a.c),
      e(null),
      f(null);

      @Nullable
      final hht.a g;

      private d(@Nullable final hht.a $$0) {
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
      hhv.d e;
      hhv.b f = hhv.b.a;
      hhv.a g = hhv.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hhv.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
