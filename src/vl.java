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

public record vl(vq d, @Nullable vh e, vo f, @Nullable uv g, uz h) {
   public static final MapCodec<vl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               vq.a.fieldOf("link").forGetter(vl::j),
               vh.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vo.a.forGetter(vl::l),
               ux.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               uz.a.optionalFieldOf("filter_mask", uz.c).forGetter(vl::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vl($$0x, (vh)$$1.orElse(null), $$2, (uv)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vl a(String $$0) {
      return a(i, $$0);
   }

   public static vl a(UUID $$0, String $$1) {
      vo $$2 = vo.a($$1);
      vq $$3 = vq.a($$0);
      return new vl($$3, null, $$2, null, uz.c);
   }

   public vl a(uv $$0) {
      uv $$1 = !$$0.equals(uv.b(this.b())) ? $$0 : null;
      return new vl(this.d, this.e, this.f, $$1, this.h);
   }

   public vl a() {
      return this.g != null ? new vl(this.d, this.e, this.f, null, this.h) : this;
   }

   public vl a(uz $$0) {
      return this.h.equals($$0) ? this : new vl(this.d, this.e, this.f, this.g, $$0);
   }

   public vl a(boolean $$0) {
      return this.a($$0 ? this.h : uz.c);
   }

   public static void a(aub.a $$0, vq $$1, vo $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(auc $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public uv c() {
      return Objects.requireNonNullElseGet(this.g, () -> uv.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public vq j() {
      return this.d;
   }

   @Nullable
   public vh k() {
      return this.e;
   }

   public vo l() {
      return this.f;
   }

   @Nullable
   public uv m() {
      return this.g;
   }

   public uz n() {
      return this.h;
   }
}
