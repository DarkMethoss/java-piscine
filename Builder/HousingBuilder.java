interface HousingBuilder {
    abstract HousingBuilder setSize(int size);
    abstract HousingBuilder setPrice(int price);
    abstract HousingBuilder setRooms(int rooms);
    abstract HousingBuilder setName(String name);
    abstract Housing build();
}