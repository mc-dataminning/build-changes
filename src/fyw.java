import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fyw implements zl {
   private static final wy l = wy.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fgi a;
   protected final vs b;
   @Nullable
   protected final fzn c;
   @Nullable
   protected String d;
   protected final gvl e;
   @Nullable
   protected final fnx f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<fyw.a> n = new ArrayList<>();
   protected final Map<akq, byte[]> i;
   protected Map<String, String> j;
   protected ali k;

   protected fyw(fgi $$0, vs $$1, fzd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
      this.j = $$2.k();
      this.k = $$2.l();
   }

   @Override
   public void a(zf $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      zl.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<String> $$3 = this.k.a(ali.b.a).map(ali.a::c);
      if (this.h) {
         this.b.a(new vu(wy.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public vu a(wy $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<String> $$3 = this.k.a(ali.b.a).map(ali.a::c);
      return new vu($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zf $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zi.a($$2, this, $$0);
      Path $$3 = this.a.p.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ad.f() + "-client.txt");
      Optional<ali.a> $$5 = this.k.a(ali.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zf<?> $$0) {
      return zl.super.a($$0) ? true : this.g && ($$0 instanceof zu || $$0 instanceof zv);
   }

   @Override
   public void a(zp $$0) {
      this.a(new aab($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zq $$0) {
      zi.a($$0, this, this.a);
      this.b(new aac($$0.b()));
   }

   @Override
   public void a(zm $$0) {
      aai $$1 = $$0.b();
      if (!($$1 instanceof aaj)) {
         zi.a($$0, this, this.a);
         if ($$1 instanceof aag $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aai var1);

   @Override
   public void a(zs $$0) {
      zi.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aad($$1, aad.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fzn.a $$5 = this.c != null ? this.c.b() : fzn.a.c;
         if ($$5 != fzn.a.c && (!$$4 || $$5 != fzn.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zr $$0) {
      zi.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wy a(wy $$0, @Nullable wy $$1) {
      return (wy)($$1 == null ? $$0 : wy.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abo $$0) {
      zi.a($$0, this, this.a);
      this.b.a(new abr($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(zu $$0) {
      zi.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zn $$0) {
      zi.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(zt $$0) {
      zi.a($$0, this, this.a);
      this.k = $$0.b();
   }

   @Override
   public void a(zv $$0) {
      this.g = true;
      zi.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wy.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gar $$1 = new gar($$0.b(), $$0.e());
         fmw.a(Objects.requireNonNullElseGet(this.f, fnz::new), this.a, $$1, this.c, false, new fzs(this.i));
      }
   }

   @Override
   public void a(zo $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fyw.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         fyw.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zf<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vu $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      m.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.j.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.j.forEach($$2::a);
      }
   }

   protected fnx b(vu $$0) {
      fnx $$1 = Objects.requireNonNullElseGet(this.f, () -> new fqn(new fnz()));
      return (fnx)(this.c != null && this.c.e() ? new gwf($$1, l, $$0.a()) : new fne($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zf<? extends wk> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new fyw.a($$0, $$1, ad.c() + $$2.toMillis()));
      }
   }

   private fnx a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wy $$4) {
      fnx $$5 = this.a.y;
      return $$5 instanceof fyw.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fyw.b(this.a, $$5, List.of(new fyw.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zf<? extends wk> a, BooleanSupplier b, long c) {
   }

   class b extends fmv {
      private final List<fyw.b.a> r;
      @Nullable
      private final fnx s;

      b(final fgi $$0, @Nullable final fnx $$1, final List<fyw.b.a> $$2, final boolean $$3, @Nullable final wy $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gsv $$6 = $$0.ae();
               if ($$5) {
                  if (fyw.this.c != null) {
                     fyw.this.c.a(fzn.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fyw.this.b.a(wy.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fyw.this.c != null) {
                     fyw.this.c.a(fzn.a.b);
                  }
               }

               for (fyw.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fyw.this.c != null) {
                  fzo.b(fyw.this.c);
               }
            },
            $$3 ? wy.c("multiplayer.requiredTexturePrompt.line1") : wy.c("multiplayer.texturePrompt.line1"),
            fyw.a($$3 ? wy.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wy.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wx.i : wx.f,
            $$3 ? wx.p : wx.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fyw.b a(fgi $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wy $$5) {
         List<fyw.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fyw.b.a($$1, $$2, $$3)).build();
         return fyw.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
