import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record xs(xx d, @Nullable xo e, xv f, @Nullable xc g, xg h) {
   public static final MapCodec<xs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xx.a.fieldOf("link").forGetter(xs::k),
               xo.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xv.a.forGetter(xs::m),
               xe.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xg.a.optionalFieldOf("filter_mask", xg.c).forGetter(xs::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xs($$0x, (xo)$$1.orElse(null), $$2, (xc)$$3.orElse(null), $$4))
   );
   private static final UUID i = ag.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xs a(String $$0) {
      return a(i, $$0);
   }

   public static xs a(UUID $$0, String $$1) {
      xv $$2 = xv.a($$1);
      xx $$3 = xx.a($$0);
      return new xs($$3, null, $$2, null, xg.c);
   }

   public xs a(xc $$0) {
      xc $$1 = !$$0.equals(xc.b(this.c())) ? $$0 : null;
      return new xs(this.d, this.e, this.f, $$1, this.h);
   }

   public xs a() {
      return this.g != null ? new xs(this.d, this.e, this.f, null, this.h) : this;
   }

   public xs a(xg $$0) {
      return this.h.equals($$0) ? this : new xs(this.d, this.e, this.f, this.g, $$0);
   }

   public xs a(boolean $$0) {
      return this.a($$0 ? this.h : xg.c);
   }

   public xs b() {
      xv $$0 = xv.a(this.c());
      xx $$1 = xx.a(this.g());
      return new xs($$1, null, $$0, this.g, this.h);
   }

   public static void a(bae.a $$0, xx $$1, xv $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(baf $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xc d() {
      return Objects.requireNonNullElseGet(this.g, () -> xc.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public xx k() {
      return this.d;
   }

   @Nullable
   public xo l() {
      return this.e;
   }

   public xv m() {
      return this.f;
   }

   @Nullable
   public xc n() {
      return this.g;
   }

   public xg o() {
      return this.h;
   }
}
